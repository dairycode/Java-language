package Java编程思想_面向对象之多态.demo5;

public class Dog extends Animal {
    //alt + enter: 快捷键,自动帮你重写方法
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
