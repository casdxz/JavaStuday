package top.bearcad.java.jdbc.dao.impl;

import top.bearcad.java.jdbc.dao.StudentDao;
import top.bearcad.java.jdbc.entity.Student;
import top.bearcad.java.jdbc.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-12-02 09:34
 **/
public class StudentDaoImpl implements StudentDao {

    @Override
    public int insertStudent(Student student) throws SQLException {
        Connection collection = JdbcUtil.getConnection();
        String insertSql = "insert into t_student (mobile,user_name,password) values (?,?,?)";
        PreparedStatement preparedStatement = collection.prepareStatement(insertSql);
        preparedStatement.setString(1,student.getMobile());
        preparedStatement.setString(2,student.getUserName());
        preparedStatement.setString(3,student.getPassword());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int deleteStudent(Student student) throws SQLException {
        Connection collection = JdbcUtil.getConnection();
        String DeleteSql = "delete from t_student where mobile=(?)";
        PreparedStatement preparedStatement = collection.prepareStatement(DeleteSql);
        preparedStatement.setString(1,student.getMobile());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int updateStudent(Student student) throws SQLException {
        Connection collection = JdbcUtil.getConnection();
        String DeleteSql = "update  t_student set user_name=? where id=?";
        PreparedStatement preparedStatement = collection.prepareStatement(DeleteSql);
        preparedStatement.setString(1,student.getUserName());
        preparedStatement.setLong(2,student.getId());
        return preparedStatement.executeUpdate();
    }

}
