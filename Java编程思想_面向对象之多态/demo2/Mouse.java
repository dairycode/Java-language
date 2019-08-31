package Java编程思想_面向对象之多态.demo2;

public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "吃奶酪");
    }
}
