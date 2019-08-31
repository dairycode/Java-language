package Java编程思想_面向对象之封装;

/*
    定义一个学生类
 */
public class Student3 {
    //构造方法
    //无参构造
    public Student3() {}

    //带参构造
    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员变量
    private String name;
    private int age;

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }
    //获取姓名
    public String getName() {
        return name;
    }

    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    //获取年龄
    public int getAge() {
        return age;
    }
}
