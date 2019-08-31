package Java编程思想_面向对象之多态.demo4;

public class Test {
    public static void main(String[] args) {
        //需求:通过多态创建对象,调用子类中的成员
        Animal an = new Dog();

        //调用eat()方法
        an.eat();

        //调用watch()方法,属于子类独有的方法
        //an.watch();
        //正确的写法
        //Dog dog = (Dog)an;
        //dog.watch();

        //不正确的转换
        //Cat c = (Cat)an;

        //优化后的方案,判断当前对象是否是Dog类的对象,如果是,再调用watch()方法
        if(an instanceof Dog) {
            Dog dog = (Dog)an;
            dog.watch();
        }
    }
}
