package Java核心_运算符;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //基本的赋值运算符
        int a = 10;
        System.out.println("a:" + a);
        System.out.println("----------------");

        //扩展的赋值运算符
        //+=的作用:把左右两边的数值相加,然后把结果赋值给左边:a = a + 20
        a += 20;
        System.out.println("a:" + a);
        System.out.println("----------------");

        //扩展赋值运算符的好处
        short s = 2;
        //s = s + 1;  //为什么报错? 因为s + 1的结果是一个int类型的数据
        //怎么解决呢?
        //方案一:强制类型转换
        s = (short)(s + 1);
        System.out.println("s:" + s);
        System.out.println("----------------");

        //方案二:通过扩展赋值运算符实现
        s+=3;
        System.out.println("s:" + s);
    }
}
