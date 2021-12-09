package top.bearcad.java.jdbc.enums;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-12-02 10:44
 **/
public enum Gender {
    /**
     * 性别枚举
     */
    MALE((short) 0),
    FEMALE((short) 1),
    SECRET((short) 2);
    private final short genderCode;

    Gender(short genderCode){
        this.genderCode = genderCode;
    }
    public Short getGenderCode(){
        return  this.getGenderCode();
    }
}
