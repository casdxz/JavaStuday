package arr;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-03 00:27
 **/
public class Demo {

    public static void main (String[] args){
        new Person(1);
        new Person(2);
        new Person(3);
        new Person(4);
        new Person(5);
        System.gc();//建议马上启动垃圾回收器
    }
}
class Person {
    private int i;
    public Person(int i ){
        this.i = i;
    }
    @Override
    public void finalize() throws Throwable {
        //清除垃圾时，会默认调用被清空对象的
        System.out.println("第" + i +"次垃圾回收启动了");
    }

    /*
    public static void main(String[] args) {
        System.out.println(System.getProperties());   //输出内容太多，略。比如操作系统名称等。
    }

     */
    /*
    public static void main(String argv[]) {
        String osName = System.getProperty("os.name");
        String osVer = System.getProperty("os.version");
        System.out.println(osName + " v" + osVer);
    }

     */
    /*
    public static void main(String[] args) {

        try {
            System.out.println("this is try");
            System.exit(0);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("this is finally");
        }

    }

     */
}
