package Java核心_流程控制之选择结构;

public class IfDemo3 {
    public static void main(String[] args) {
        //需求:黑马智能机器人小黑和你打招呼
        //1.定义变量,记录时间
        int time = 8;

        //2.小黑根据你的时间和你打招呼
        if(time >= 0 && time <= 12) {
            System.out.println("小黑和我说:上午好");
        } else if(time >= 13 && time <= 18) {
            System.out.println("小黑和我说:下午好");
        } else if(time >= 19 && time <= 24) {
            System.out.println("小黑和我说:晚上好");
        } else {
            //说明上述的三组条件都不满足
            System.out.println("小黑和我说:买了否冷,我不认识这个时间");
        }
    }
}
