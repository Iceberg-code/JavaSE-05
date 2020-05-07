package cn.itcast.day05.demo03;

public class Student {
    private int id;         //学号 - 自动生成学号
    private String name;    //姓名
    private int age;        //年龄
    static String room;     //所在教室
    private static int idCounter = 0;   //学号计数器，每当new了一个新对象的时候，计数器++
//    private int idCounter = 0;   //注意与上一条语句的区别：有static则每次加都在上次的基础上，
//                                                         没有static则每次都是重新开始


    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;  //先++，再赋值给id
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
