package Java核心_运算符;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a = 5;

        //单独使用
        /*//a++;
        ++a;
        //下述输出语句的结果是:"a:"和变量a的值进行拼接
        System.out.println("a:" + a);*/

        //参与运算
        //++在后
        int b = a++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
