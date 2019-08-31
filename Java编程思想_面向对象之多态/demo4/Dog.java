package Java编程思想_面向对象之多态.demo4;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //狗类独有的方法,父类中是没有这个成员方法的
    public void watch() {
        System.out.println("狗会看家");
    }
}
