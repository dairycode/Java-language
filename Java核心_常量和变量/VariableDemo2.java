package Java核心_常量和变量;

/*
 * 变量的定义格式:
 *      数据类型 变量名 = 初始化值
 *
 *  数据类型
 *      byte,short,int,long,float,double,char,boolean
 *
 *  定义变量的注意事项:
 *      1.整型默认是int类型,定义long型变量的时候,后边要加字母L(大小写均可)
 *      2.浮点型默认是double类型,定义float类型变量的时候,后边要加字母F(大小写均可)
 *
 *  使用变量的注意事项:
 *      1.变量未赋值,不能使用
 *      2.变量只在它所属的范围内有效(这就是变量的作用域)
 *      3.一行上可以定义多个变量,但是不建议这样写
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        //byte类型的变量
        byte b = 10;
        System.out.println(b);

        //short类型的变量
        short s = 20;
        System.out.println(s);

        //int类型的变量
        int i = 30;
        System.out.println(i);

        //long类型的变量
        long l = 10000000000L;
        System.out.println(l);

        //float类型的变量
        float f = 10.3F;
        System.out.println(f);

        //double类型的变量
        double d =10.2;
        System.out.println(d);

        //char类型的变量
        char c = 'a';
        System.out.println(c);

        //boolean类型的变量
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("---------------------------------");

        int a;
        a = 10;
        System.out.println(a);

        //代码块:用大括号括起来的内容就是代码块
        {
            int aa = 20;
            System.out.println(aa);
        }
    }
}