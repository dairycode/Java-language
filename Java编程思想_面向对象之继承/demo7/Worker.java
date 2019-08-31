package Java编程思想_面向对象之继承.demo7;

//子类
public class Worker extends Person{
    public Worker() {
        //super();
        super("小黑");
        System.out.println("Worker类的 空参构造");
    }
}
