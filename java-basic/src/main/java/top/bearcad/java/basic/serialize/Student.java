package top.bearcad.java.basic.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-18 21:01
 **/
public class Student implements Serializable {
    private static final long serialVersionUID = -4392658638228508589L;
    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  Integer getAge(){
        return age;
    }
    public void setAge(Integer age ){
        this.age = age;
    }
    public Integer getScore(){
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPassword() {
        return passwd;
    }

    public void setPassword(String password) {
        this.passwd = password;
    }

    /**
     *
     * @param objectInputStream 对象输入流
     * @throws IOException 异常
     * @throws ClassNotFoundException 异常
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException,ClassNotFoundException{
        objectInputStream.defaultReadObject();
        if (0 >score || 100 < score){
            throw new IllegalArgumentException("学生分数只能在0到100之间！");
        }
    }
    @Override
    public String toString() {
        return "Student:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "score = " + this.score + '\n' +
                "passwd = " + this.passwd + '\n'

                ;
    }
}
