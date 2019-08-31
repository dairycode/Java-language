package Java核心_方法和数组;

public class MethodDemo3 {
    public static void main(String[] args) {
        //调用方法
        boolean c = compare(10, 20);
        System.out.println(c);
    }   //main方法的结束标记

    //定义方法,比较两个整数是否相等
    public static boolean compare(int a, int b) {
        return a == b;
    }   //compare方法的结束标记
}   //MethodDemo3类的结束标记
