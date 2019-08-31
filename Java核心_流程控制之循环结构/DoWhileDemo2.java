package Java核心_流程控制之循环结构;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        //需求:演示三种循环的区别
        /*
            1.格式不同
            2.初始化语句不同
            3.循环体的执行次数不同
            4.使用场景不同
         */
        //案例:分别通过三种循环打印1-5之间的数字
        //for循环
        for(int a = 1; a <= 5; a++) {
            System.out.println("a:" + a);
        }
        System.out.println("-----------");

        //while循环
        int b = 1;
        while(b <= 5) {
            System.out.println("b:" + b);
            b++;
        }
        System.out.println("-----------");

        //do..while循环
        int c = 1;
        do{
            System.out.println("c:" + c);
            c++;
        }while(c <= 5);
    }
}
