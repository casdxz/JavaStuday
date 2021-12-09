package top.bearcad.java.jdbc.dao;

import top.bearcad.java.jdbc.entity.Student;

import java.sql.SQLException;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-12-02 09:31
 **/
public interface StudentDao {
    /**
     * 新增学生
     * @param student 入参对象
     * @return 受影响的记录行数
     * @throws SQLException SQL异常
     */
    int insertStudent(Student student) throws SQLException;

    int deleteStudent(Student student) throws SQLException;

    int updateStudent(Student student) throws SQLException;

    //int insertStudent(Student student) throws SQLException;
    //
    //int[] batchInsert(List<Student> studentList) throws SQLException;
    //
    //List<Student>
}
