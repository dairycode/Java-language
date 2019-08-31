package Java编程思想_面向对象之多态.demo2;

//子类,狗类
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
}
