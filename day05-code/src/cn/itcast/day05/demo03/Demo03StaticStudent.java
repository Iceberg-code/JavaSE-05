package cn.itcast.day05.demo03;
/*
* 注意：根据类名称访问静态成员变量的时候，全程和对象就没关系，之和类有关系
* */
public class Demo03StaticStudent {

    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("源氏", 10);
        System.out.println("one的姓名" + one.getName());
        System.out.println("one的年龄" + one.getAge());
        System.out.println("one的教室" + Student.room);
        System.out.println("============");

        Student two = new Student("半藏", 11);
        System.out.println("two的姓名" + two.getName());
        System.out.println("two的年龄" + two.getAge());
        System.out.println("two的教室" + Student.room);
    }
}
