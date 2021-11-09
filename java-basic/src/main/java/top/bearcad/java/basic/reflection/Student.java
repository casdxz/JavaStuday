package top.bearcad.java.basic.reflection;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-11-09 20:34
 **/
@TableSu("t_student")
class Student {
    @FieldSu(columnName = "user_id", type = "int", length = 10)
    private int id;
    @FieldSu(columnName = "user_name", type = "varchar2", length = 10)
    private String name;
    @FieldSu(columnName = "user_age", type = "int", length = 10)
    private int age;

    public Student(){
    }

    public Student(int id,String name, int age ){
    this.id = id;
    this.name = name;
    this.age = age;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int Age(){
        return id;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",age=" + age +
                '}';
    }
}
