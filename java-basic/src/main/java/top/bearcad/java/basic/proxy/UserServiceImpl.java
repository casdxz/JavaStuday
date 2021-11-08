package top.bearcad.java.basic.proxy;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-08 22:45
 **/
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
