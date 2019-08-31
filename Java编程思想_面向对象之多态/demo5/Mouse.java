package Java编程思想_面向对象之多态.demo5;

//子类,老鼠类
public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println("老鼠吃奶酪");
    }
}
