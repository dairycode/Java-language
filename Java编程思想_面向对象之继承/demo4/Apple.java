package Java编程思想_面向对象之继承.demo4;

public class Apple extends Fruit {
    //成员变量
    int price = 10;

    public void showPrice() {
        //局部变量
        int price = 5;

        System.out.println(price);
        System.out.println(this.price);
        System.out.println(super.price);
    }
}
