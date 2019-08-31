package Java编程思想_面向对象之继承.demo3;

public class Test {
    public static void main(String[] args) {
        //测试狗类
        Dog d = new Dog();
        d.eat();
        d.watch();
        System.out.println("--------------");

        //测试猪类
        Pig p = new Pig();
        p.eat();
        p.snore();
    }
}
