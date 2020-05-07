package cn.itcast.day05.demo02;
/*
* 分割字符串的方法：
* public String[] split(String regex)：按照参数的规则，将字符串切分成若干部分
*
* 注意事项：
* split方法的参数实际是一个正则表达式。（今后学习）
* 今天要注意：如果按照英文句点“.”进行切分，必须写“\\.”（两个反斜杠）
* */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");  //逗号作为参数
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===========");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");  //空格作为参数
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===========");

        String str3 = "XXX.YYY.ZZZ";
//        String[] array3 = str3.split(".");    //注意
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);  //0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

}
