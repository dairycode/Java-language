package Java核心_流程控制之选择结构;

public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始执行");
        //需求:判断两个整数是否相等,相等则打印"相等",不相等则打印"不相等"
        int a = 10;
        int b = 20;

        //调用if语句的第二种格式
        if(a == b) {
            //能走这里,说明条件成立
            System.out.println("相等");
        } else {
            //能走这里,说明条件不成立
            System.out.println("不相等");
        }

        System.out.println("结束执行");
    }
}
