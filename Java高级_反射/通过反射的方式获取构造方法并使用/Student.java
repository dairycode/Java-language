package Java高级_反射.通过反射的方式获取构造方法并使用;

//学生类
public class Student {
    //公共的无参构造
    public Student() {}

    //公共的带参构造
    public Student(String name) {
        System.out.println("您录入的name的值是:" + name);
    }

    //私有的带参构造
    private Student(int age) {
        System.out.println("您录入的age的值是:" + age);
    }
}
