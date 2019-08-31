package Java核心_流程控制之循环结构;

public class WhileDemo {
    public static void main(String[] args) {
        //需求:打印5次HelloWorld
        //方式一:通过for循环实现
        //初始化语句; 判断条件语句; 控制条件语句
        for(int i = 1; i <= 5; i++) {
            //循环体语句
            System.out.println("HelloWorld");
        }
        System.out.println("-----------");

        //方式二:通过while循环实现
        int i = 1;
        while(i <= 5) {
            System.out.println("HelloWorld");
            i++;
        }
    }
}
