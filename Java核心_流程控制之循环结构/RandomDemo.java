package Java核心_流程控制之循环结构;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //需求:获取一个随机数
        //1.创建Random类的对象(包含:导包,创建对象)
        Random r = new Random();

        //2.通过r.nextInt(int 数字)的方式获取随机数
        /*
        int num = r.nextInt(10);    //10的意思是:获取随机数的范围是0-9,包含0,不包含10
        System.out.println(num);
         */

        //需求:获取10个随机数
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
