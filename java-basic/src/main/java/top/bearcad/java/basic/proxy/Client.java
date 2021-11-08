package top.bearcad.java.basic.proxy;

/**
 * @program: java-basic
 * @description: 执行代码代理
 * @author: bearcad
 * @create: 2021-11-08 22:47
 **/
public class Client {
    public static void main(String[] args) {
        //真实⻆色
        UserService userService = new UserServiceImpl();
        //代理⻆色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理⻆色来处理我们要调用的接口
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.update();
        proxy.delete();
        proxy.add();
        proxy.query();
    }
}
