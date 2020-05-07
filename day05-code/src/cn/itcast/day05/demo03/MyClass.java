package cn.itcast.day05.demo03;

public class MyClass {
    int num;    //成员变量
    static int numStatic;   //静态变量

    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法。");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法。");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态不能直接访问非静态【重点】
//        System.out.println(num);    //错误写法！

//        静态方法当中不能用this关键字。因为this代表当前对象，通过谁调用的方法，谁就是当前对象
//        System.out.println(this);//错误写法！

    }
}
