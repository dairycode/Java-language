package Java核心_方法和数组;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        //需求:键盘录入两个数字,比较它们是否相同
        //2.通过键盘录入功能,接收用户录入的两个整数
        //2.1创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2.2提示用户录入两个数字,并接收
        System.out.println("请录入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个整数:");
        int num2 = sc.nextInt();

        //3.调用方法,获取结果,并打印
        boolean is = compare(num1, num2);
        System.out.println(is);
    }

    /*
        1.定义方法,用来判断两个整数是否相等
            明确方法名:       compare
            明确返回值类型:    boolean
            明确参数列表:     int a,int b
     */
    public static boolean compare(int a, int b) {
        //具体比较过程
        //原始做法
        //boolean c = (a == b);
        //return c;

        //优化做法
        return a == b;
    }
}
