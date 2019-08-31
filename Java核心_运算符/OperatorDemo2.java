package Java核心_运算符;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //字符的加法运算
        //定义两个变量,int,char
        int a = 10;
        char ch = 'a';
        System.out.println(a + ch); //107

        //字符串的加法语句
        System.out.println("hello" + "world");
        System.out.println("hello" + 10);
        System.out.println("hello" + 10 + 20);
        System.out.println(10 + 20 + "hello");
    }
}
