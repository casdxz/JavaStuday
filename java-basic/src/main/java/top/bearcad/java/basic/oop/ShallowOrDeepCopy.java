package top.bearcad.java.basic.oop;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-15 21:13
 **/
@Slf4j
public class ShallowOrDeepCopy {
    public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
        Student student = new Student();
        student.setId(1);
        student.setName("bear");
        Address address = new Address();
        address.setId(101);
        address.setDescribe("江苏泗阳");
        student.setAddress(address);

        Student cloneStudent = (Student) student.clone();
        log.info ("**********************************************");
        log.info("student == cloneStudent:{}", student == cloneStudent);
        log.info("二级对象内容：{}", student.getAddress() == cloneStudent.getAddress());
        log.info("二级对象中内容：{}",student.getAddress().getDescribe() ==
                cloneStudent.getAddress().getDescribe());

        log.info("********************修改属性前**************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
        student.setName("金帅");
        address.setDescribe("江苏泗阳");
        log.info("********************修改属性后**************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());

    }
}
