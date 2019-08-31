package Java高级_反射.通过反射获取成员变量并使用;

//学生类
public class Student {
    //公共的属性
    public String name;
    //私有的属性
    private int age;

    //用来打印对象的各个属性值的
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
