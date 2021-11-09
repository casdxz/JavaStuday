package top.bearcad.java.basic.reflection;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 20:33
 **/
public class Person {
    private Integer id;
    private String name;

    public Person(){
    }

    public Person(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public static void getPerson(){
        System.out.println("I am a person.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
