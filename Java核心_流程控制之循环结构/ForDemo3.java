package Java核心_流程控制之循环结构;

public class ForDemo3 {
    public static void main(String[] args) {
        //需求:计算1-5之间的所有数据之和
        //1.定义求和变量sum
        int sum = 0;
        //2.通过for循环获取1-5之间的数据
        for(int i = 1; i <= 5; i++) {
            //i记录的就是1-5之间所有的数字

            //3.sum = sum + i
            sum += i;
        }

        //4.打印结果
        System.out.println(sum);
    }
}
