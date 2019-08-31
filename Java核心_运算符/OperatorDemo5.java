package Java核心_运算符;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //定义三个变量
        int a = 10;
        int b = 20;
        int c = 10;

        //==:等于
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("----------------");

        //!=:不等于
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("----------------");

        //>:大于
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("----------------");

        //>=:大于等于
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println("----------------");

        //注意:==是判断是否相等,=是赋值的意思
        System.out.println(a == b);
        System.out.println(a = b);
    }
}
