package top.bearcad.java.basic.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.Comparator;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-18 08:27
 **/
public class IoDemo2 {
    public static void main(String[] args)throws IOException {
        //charSetDemo();
        //transferDemo();
        //writerDemo();
        //readerDemo();
        //printWriterDemo();
        //bufferedWriterDemo();
        textSortDemo();
    }

    private static void charSetDemo() throws UnsupportedEncodingException{
        byte[] bytes = "你好".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);

        ByteArrayOutputStream baos;
        byte[] gbks = "你好".getBytes(StandardCharsets.UTF_16);
        System.out.println(Arrays.toString(gbks));
        System.out.println(gbks.length);

        //byte[] bytes = "你好".getBytes(StandardCharsets.UTF_16);
        //System.out.println(Arrays.toString(bytes));
        //System.out.println(bytes.length);
    }

    private static void transferDemo() throws IOException{
        File file = new File("out.txt");
        //OutputStream out = new FileOutputStream(file);
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("out.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("out.txt"),StandardCharsets.UTF_8);
        //写单个字符
        //osw.write(98);
        //osw.flush();
        //osw.close();

        //写一个数组
        //char[] arr = {'你', '好', 'c', 'd', 'e'};
        //osw.write(arr,1,3);
        //osw.write("你好，java工程师");
        //osw.flush();
        //osw.close();

        File file1 = new File("in.txt");
        //InputStream in;
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
        char[] arr = new char[(int) file1.length()];
        int res = isr.read(arr);
        System.out.println(res);
        System.out.println(arr);
        System.out.println(arr.length);
        //int read;
        //System.out.println(isr.read());
        //read = isr.read();
        //System.out.println(read);
        //while((read = isr.read()) != -1){
        //    System.out.print((char) read);
        //}
        //isr.close();

    }

    private static void writerDemo() throws IOException{
        //通过File对象创建字符流
        Writer fw = new FileWriter("fw.txt");
        //写单个字符
        fw.write(101);
        fw.flush();
        //写字符数组
        fw.write("abcde".toCharArray());
        fw.flush();
        //写字符数组的一部分
        fw.write("abcde".toCharArray(),1,3);
        fw.flush();
        //写字符串
        fw.write("你好");
        fw.flush();

        fw.close();
    }

    private static void readerDemo() throws IOException{
        //File file = new File("fr.txt");
        //Reader fr = new FileReader(file);
        //int len;
        //char[] arr = new char[(int) file.length()];
        //char[] arr = new char[3];
        //while ((len = fr.read(arr)) != -1){
        //    System.out.println(new String(arr,0,len));
        //}
        //fr.close();
        Scanner scanner = new Scanner(new FileInputStream("fr.txt"));
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();
    }

    private static void printWriterDemo() throws IOException{
        File file = new File("out.txt");
        //PrintWriter pw1 = new PrintWriter(file);
        //PrintWriter pw2 = new PrintWriter(new FileOutputStream(file));
        //Writer writer = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(new FileWriter(file),true);
        pw.println(97);
        pw.println("你好");
        pw.println(true);
        pw.close();

    }

    /**
     *
     */

    private static void bufferedWriterDemo() throws IOException{
        //
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        //
        bw.write("2126");
        //
        bw.newLine();
        bw.write("面对对象高级程序设计");
        bw.newLine();
        bw.close();
    }

    private static void bufferedReadeDemo() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        String line;
        //while (line = br.readLine() != null){
        //
        //}
    }

    private static void textSortDemo()throws IOException{
        //1.读取源文件，放入集合
        BufferedReader br = new BufferedReader(new FileReader("read.txt"));
        Writer out;
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
        List<String> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            list.add(line);
        }
        //2.使用Collections集合工具类提供sort方法，排序处理
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        //遍历list，写到外部文件
        for (String s : list){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}

