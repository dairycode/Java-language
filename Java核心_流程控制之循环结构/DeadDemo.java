package Java核心_流程控制之循环结构;

public class DeadDemo {
    public static void main(String[] args) {
        //需求:演示死循环
        /*
            格式1:for循环的死循环
                for(;;) {
                    循环体
                }
         */
        /*
            for(;;) {
                System.out.println("看看我是不是会一直执行!");
            }
         */

        /*
            格式2:while循环的死循环
                while(true) {
                    循环体
                }
         */
        while(true) {
            System.out.println("看看我是不是会一直执行!");
        }
    }
}
