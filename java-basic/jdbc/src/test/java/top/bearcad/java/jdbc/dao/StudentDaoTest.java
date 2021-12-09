package top.bearcad.java.jdbc.dao;

import org.junit.jupiter.api.Test;
import top.bearcad.java.jdbc.dao.impl.StudentDaoImpl;
import top.bearcad.java.jdbc.entity.Student;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-12-02 22:21
 **/
class StudentDaoTest {

    @Test
    void insertStudent() {
        Student student1=Student.builder()
                .id(1010L)
                .mobile("19910151112")
                .userName("root")
                .password("980529")
                .build();
        StudentDao studentDao=new StudentDaoImpl();
        int rows = 0;
        try {
            rows = studentDao.insertStudent(student1);
        } catch (SQLException e) {
            System.err.println("插入学生操作发生Sql异常");
        }
        assertEquals(1,rows);
    }

    @Test
    void deleteStudent() {
        Student student1=Student.builder()
                .mobile("19910151111")
                .build();
        StudentDao studentDao=new StudentDaoImpl();
        int rows = 0;
        try {
            rows = studentDao.deleteStudent(student1);
        } catch (SQLException e) {
            System.err.println("插入学生操作发生Sql异常");
        }
        assertEquals(1,rows);
    }

    @Test
    void updateStudent() {
        Student student1=Student.builder()
                .userName("bear")
                .id(1010L)
                .build();
        StudentDao studentDao=new StudentDaoImpl();
        int rows = 0;
        try {
            rows = studentDao.updateStudent(student1);
        } catch (SQLException e) {
            System.err.println("插入学生操作发生Sql异常");
        }
        assertEquals(1,rows);
    }
}