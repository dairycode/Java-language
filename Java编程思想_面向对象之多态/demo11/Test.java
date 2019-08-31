package Java编程思想_面向对象之多态.demo11;

/*
    接口:
        就是提供的统一规则,规范:
        定义格式:
            interface 接口名 {}
        接口和接口之间是实现关系,用关键字implements来表示
            class 类名 implements 接口名 {}
 */
public class Test {
    public static void main(String[] args) {
        //多态
        Smoking sm = new Teacher();
        sm.smoke();
    }
}
