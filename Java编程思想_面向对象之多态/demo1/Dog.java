package Java编程思想_面向对象之多态.demo1;

//类Animal类的子类
public class Dog extends Animal {
    //需求:因为狗吃骨头,所以要优化父类的eat()方法
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
}
