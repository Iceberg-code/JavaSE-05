package cn.itcast.day05.demo03;
/*
* 如果一个成员变量使用了static关键字，那么这个变量不再属于自己，而是属于所在的类。多个对象共享同一份数据
*
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("源氏", 19);
        one.room = "101教室"; //只在one处定义room,没有在two处定义room，但是two.room与one.room输出结果一样
        System.out.println("姓名：" + one.getName() +
                "，年龄：" + one.getAge() +
                "，教室：" + one.room +
                "，学号：" + one.getId());

        Student two = new Student("半藏", 20);
        System.out.println("姓名：" + two.getName() +
                "，年龄：" + two.getAge()+
                "，教室：" + two.room +
                "，学号：" + two.getId());

//        Student three = new Student();
//        System.out.println("，学号：" + three.getId());
//
//        Student four = new Student("安娜", 22);
//        System.out.println("姓名：" + four.getName() +
//                "，年龄：" + four.getAge()+
//                "，教室：" + four.room +
//                "，学号：" + four.getId());
    }

}
