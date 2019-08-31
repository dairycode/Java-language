package Java核心_流程控制之循环结构;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        //1.获取一个1-100之间的随机数,让用户猜
        Random r = new Random();
        //1.2获取指定范围的随机数
        int num = r.nextInt(100) + 1;   //1-100

        //2.通过键盘录入获取用户猜的数字,并接收
        //2.1创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2.2提示用户录入要猜的数据,并接收
        //System.out.println("请录入您要猜的数字(1-100)");
        //int guessNum = sc.nextInt();

        /*
        //3.比较两个数字,看是否一致,并给出相应的提示
        if(guessNum > num) {
            System.out.println("您猜大了");
        } else if(guessNum < num) {
            System.out.println("您猜小了");
        } else {
            System.out.println("恭喜您,猜对了,请找小黑领取奖品");
        }
         */

        //4.因为不知道你多少次能猜对,所以用死循环改进
        while(true) {
            System.out.println("请录入您要猜的数字(1-100)");
            int guessNum = sc.nextInt();
            if(guessNum > num) {
                System.out.println("您猜大了");
            } else if(guessNum < num) {
                System.out.println("您猜小了");
            } else {
                System.out.println("恭喜您,猜对了,请找小黑领取奖品");
                break;
            }
        }
    }
}
