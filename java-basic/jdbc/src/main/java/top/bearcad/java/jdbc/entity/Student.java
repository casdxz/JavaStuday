package top.bearcad.java.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-12-02 09:29
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Long id;
    private String mobile;
    private String userName;
    private String password;
    private LocalDate birthday;
    private  String gender;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Short isDelete;

}
