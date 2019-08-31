package Java编程思想_面向对象之多态.demo1;

public class Animal {
    //姓名
    private String name;

    //空参构造
    public Animal() {
    }

    //全参构造
    public Animal(String name) {
        this.name = name;
    }

    //getXxx(), setXxx()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }
}
