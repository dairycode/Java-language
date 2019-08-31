package Java核心_常量和变量;

public class ConstantDemo {
    /*
        补充两个快捷方式:
            main方法的快捷键: psvm
            输出语句的快捷键: sout

        常量:
            概述:
                在程序的运行过程中,其值不会发生改变的量

            字面值常量分类:
                1.字符串常量,值要用""括起来, "abc"
                2.字符常量,值要用''括起来, 'a','0'
                3.整数常量, 10,20
                4.小数常量, 1.2
                5.布尔常量,值有两个, true和false
                6.空常量, null 目前先做了解
     */
    public static void main(String[] args) {
        //1.字符串常量
        System.out.println("abc");
        System.out.println("123");

        //2.字符常量
        System.out.println('a');
        System.out.println('0');

        //3.整数常量
        System.out.println(10);
        System.out.println(-10);

        //4.小数常量
        System.out.println(1.2);
        System.out.println(-12.3);

        //5.布尔常量
        System.out.println(true);
        System.out.println(false);
    }
}