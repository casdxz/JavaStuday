package top.bearcad.java.basic.threaddemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@SuppressWarnings("resource")
public class Down {
    /**
     * 配置线程池
     */
    int threadSize = 8;
    private final ExecutorService threads = Executors.newFixedThreadPool(threadSize);
    CountDownLatch latch = new CountDownLatch(0);

    static final String FILE_ACCESS_MODE = "rwd";
    /**
     * http连接源
     */

    String source;
    /**
     * 本地文件下载的路径
     */
    String dir = "D:\\";

    String fileName;

    String tempFileName;

    static  final int LEN = 1024 * 1024 * 6;

    private final Set<Integer> used = new HashSet<>();

    private final Set<Integer> todo = new HashSet<>();

    private final Map<Integer,String> ranges = new HashMap<>();

    private HttpURLConnection getConn() throws Exception{
        URL url = new URL(source);
        return (HttpURLConnection) url.openConnection();
    }
    private  static String getFileNameFromPath(String path){
        String[] dirs = path.split("/");
        return dirs[dirs.length-1];
    }

    private String getLocalPath() {
        return dir + fileName;
    }

    public Down(String source) {
        this(source, getFileNameFromPath(source));
    }

    public Down(String source, String fileName) {
        this.source = source;
        this.fileName = fileName;
        this.tempFileName = getLocalPath()+".temp";
        init();
    }

    private boolean isPresent() {
        return  new File(getLocalPath()).exists()&& !new File(tempFileName).exists();
    }


    private void init() {
        if(isPresent()) {
            System.out.printf("[%s] 文件已经成功下载",fileName);
            return;
        }
        try {
            System.out.println("===> 创建本地文件");
            createLocalFileIfNotExist();
            System.out.println("===> 创建进度记录文件");
            processProgressFile();
            System.out.println("===> 文件切片处理");
            createDownIndexBySplit();
            System.out.println("===> 初始化结束");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }



    private void createLocalFileIfNotExist() throws Exception{
        File file = new File(getLocalPath());
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if (!file.exists()){
            RandomAccessFile accessFile = new RandomAccessFile(file, FILE_ACCESS_MODE);
            accessFile.setLength(getConn().getContentLengthLong());
        }
    }

    private void processProgressFile() throws IOException {
        File temp = new File(tempFileName);
        if(!temp.exists()){
            temp.createNewFile();
        }else {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(temp));
            String str = bufferedReader.readLine();
        }
    }

    private void createDownIndexBySplit() throws Exception {
        int fileLen = getConn().getContentLength();
        for (int i = (int)(fileLen/LEN); i >=0 ; i--) {
            ranges.put(i, "bytes=" + i * LEN + "-" + Math.min(fileLen + 1, (i + 1) * LEN));
            System.out.println(ranges.get(i));
        }
        todo.addAll(used);
        latch = new CountDownLatch(todo.size());
    }

    public void down() {
        todo.forEach(i->threads.execute(new DownThread(i)));
        threads.shutdown();
        try {
            latch.await();
            new File(tempFileName).deleteOnExit();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    class DownThread implements Runnable {
        Integer index;
        byte[] bs = new byte[1024 * 128];
        DownThread(Integer index) {
            this.index = index;
        }

        @Override
        public void run() {

            try {

                HttpURLConnection conn = getConn();
                conn.setRequestProperty("Range", ranges.get(index));
                conn.setRequestProperty("User-Agent", "Mozilla/5.0(Windows NT 10.0; Win64; 64;rv:89.0) Gecko/20100101 Firefox.89.0");
                RandomAccessFile fos = new RandomAccessFile(getLocalPath(), FILE_ACCESS_MODE);
                fos.seek((long) LEN * index);
                InputStream is = conn.getInputStream();
                int read;
                while ((read = is.read(bs)) != -1) {
                    fos.write(bs, 0, read);
                }
                fos.close();
                conn.disconnect();
                synchronized (Down.class) {
                    latch.countDown();
                    used.add(index);
                    System.out.printf("当前文件：[%s],下载片段[%d]，进度[%d %%]\n", fileName, index, used.size() * 100 / ranges.keySet().size());
                    try {
                        String Demo = used.stream().map(Object::toString).collect(Collectors.joining(","));
                        Files.write(Paths.get(tempFileName), Demo.getBytes());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        Down down1 = new Down("https://cdn.jsdelivr.net/gh/casdxz/image@master/head/head.328b8vbfaq00.png");
        long end = System.currentTimeMillis();
        System.out.println("下载耗时：" + (end-begin)/1000/60.0+"分钟");
    }
}
