package top.bearcad.java.basic.oop;

import lombok.Data;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-15 22:07
 **/
@Data
class Address implements Cloneable{
    private Integer id;
    private String describe;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
