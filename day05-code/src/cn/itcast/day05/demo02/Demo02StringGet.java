package cn.itcast.day05.demo02;
/*
* String当中与获取相关的常用方法有：
*
* public int length()：获取字符串当中含有的字符个数，拿到字符串长度
* public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串
* public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始）
* public int index(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
* */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "uncionefinwcnw".length();
        System.out.println("字符串的长度：" + length);

        //拼接字符串 - 有新的字符串创建
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);   //Hello - 原封不动
        System.out.println(str2);   //World - 原封不动
        System.out.println(str3);   //HelloWorld - 全新的第三个字符串
        System.out.println("============");

        //获取指定位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在一号索引位置的字符是：" + ch);
        System.out.println("============");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        int ol = original.indexOf("ol");
        int o = original.indexOf('o');
        System.out.println("索引值是：" + index);    //2
        System.out.println("索引值是：" + ol);   //-1
        System.out.println("索引值是：" + o);    //4
        System.out.println("HelloWorld".indexOf("abc"));    //-1
    }
}
