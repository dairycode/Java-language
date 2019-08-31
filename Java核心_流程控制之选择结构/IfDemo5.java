package Java核心_流程控制之选择结构;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //2.提示学生录入成绩并接收
        System.out.println("请录入您的成绩:");
        int score = sc.nextInt();

        //3.根据学生录入的成绩,和题设的条件进行对比,并按照要求进行输出即可
        if(score >= 90 && score <= 100) {
            System.out.println("皇帝");
        } else if(score >= 80 && score < 90){
            System.out.println("宰相");
        } else if(score >= 70 && score < 80){
            System.out.println("大臣");
        } else if(score >= 60 && score < 70){
            System.out.println("县官");
        } else if(score >= 0 && score < 60){
            System.out.println("草民");
        } else {
            System.out.println("没有这样的成绩,你是从火星来的吧?");
        }
    }
}
