package Java核心_常量和变量;

public class IdentifierDemo {
    public static void main(String[] args) {
        //定义变量:记录张三的年龄
        int zhangSanAge = 23;
        System.out.println(zhangSanAge);

        int b2 = 20;
        //int 2b = 20;      1.不能以数字开头
        System.out.println(b2);

        //int class = 30;   2.不能喝Java中的关键字重名
        int className = 30;

        //3.严格区分大小写
        int a = 10;
        int A = 10;
    }
}