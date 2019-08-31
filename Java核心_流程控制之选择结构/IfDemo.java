package Java核心_流程控制之选择结构;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("开始执行");

        //定义两个int类型的变量
        int a = 10;
        int b = 20;

        //判断两个变量是否相等
        if(a == b) {
            //如果走到这里,说明条件成立
            System.out.println("a和b是相等的");
        }

        System.out.println("结束执行");
    }
}
