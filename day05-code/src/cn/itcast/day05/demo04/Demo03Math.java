package cn.itcast.day05.demo04;
/*
* java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
*
* public static double abs(double num)：获取绝对值。有多种重载
* public static double ceil(double num)：向上取整
* public static double floor(double num)：向下取整
* public static long round(double num)：四舍五入
*
* Math.PI代表近似的圆周率常量（double）
* */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(1.1));  //1.1
        System.out.println(Math.abs(0));    //0
        System.out.println(Math.abs(-0.1)); //0.1
        System.out.println("============");

        //向上取整
        System.out.println(Math.ceil(10.9));    //11.0
        System.out.println(Math.ceil(10.1));    //11.0
        System.out.println(Math.ceil(10.0));    //10.0
        System.out.println("============");

        //向下取整
        System.out.println(Math.floor(60.1));   //60.0
        System.out.println(Math.floor(60.9));   //60.0
        System.out.println(Math.floor(60.0));   //60.0
        System.out.println("============");


        //四舍五入 - 注意不带小数点
        System.out.println(Math.round(6.4));    //6
        System.out.println(Math.round(6.5));    //7
        System.out.println("============");

        //PI
        System.out.println(Math.PI);            //3.141592653589793
    }
}
