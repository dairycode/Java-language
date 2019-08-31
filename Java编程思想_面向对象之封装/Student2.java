package Java编程思想_面向对象之封装;

/*
    定义一个学生类,用来演示this关键字
 */
public class Student2 {
    //成员变量
    private int age = 20;

    //设置年龄
    public void setAge(int a) {
        this.age = a;
    }

    //获取年龄
    public int getAge() {
        return age;
    }

    //为了让你更好的理解this的作用,先做一个测试题
    public void show() {
        //局部变量
        int age = 10;

        System.out.println(age);
        System.out.println(this.age);

    }
}
