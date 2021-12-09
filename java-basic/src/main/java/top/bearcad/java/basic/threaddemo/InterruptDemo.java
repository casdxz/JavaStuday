package top.bearcad.java.basic.threaddemo;

/**
 * @program: java-basic
 * @description: 线程中断示例
 * 模拟一个后台监控线程，当外界打断他时，就结束运行
 * @author: bearcad
 * @create: 2021-11-25 09:13
 **/
public class InterruptDemo {
    /**
     * 监控线程
     */
    private static Thread monitor;

    public static void main(String[] args) throws InterruptedException {
        start();
        Thread.sleep(5000);
        stop();
    }

    private static void start(){

        monitor = new Thread(() ->{
            //不停监控
            while(true){
                Thread thread = Thread.currentThread();
                //判断当前线程是否被打断
                if (thread.isInterrupted()){
                    System.out.println("当线程已经被打断，就结束运行");
                    break;
                }
                //每隔1秒输出监控信息
                try {
                    Thread.sleep(1000);
                    System.out.println("系统监控中。。。");
                } catch (InterruptedException e) {
                    System.out.println(thread.isInterrupted());
                    System.out.println(e.getMessage());
                    //再次调用一次，使得终端标志变为true
                    thread.interrupt();
                }
            }
        });
        monitor.start();
    }

    private static void stop(){

        monitor.interrupt();
    }
}
