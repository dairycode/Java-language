package Java编程思想_面向对象之封装;

public class TestStudent4 {
    public static void main(String[] args) {
        //需求:通过空参创建对象
        Student4 stu1 = new Student4();
        stu1.setName("张无忌");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("--------------");

        //需求:通过全参创建对象
        Student4 stu2 = new Student4("韦小宝", 40);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
    }
}
