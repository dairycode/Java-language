package Java高级_反射.获取Setter方法给对象的属性设置值;

//标准的JavaBean类,学生类
public class Student {
    //成员变量
    private String name;

    //空参构造
    public Student() {}

    //带参构造
    public Student(String name) {
        this.name = name;
    }

    //getXxx()和setXxx()方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString()方法,用来打印该对象的各个属性值的
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
