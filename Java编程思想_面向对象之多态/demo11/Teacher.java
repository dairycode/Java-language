package Java编程思想_面向对象之多态.demo11;

//接口Smoking的实现类(子类)
public class Teacher implements Smoking {
    @Override
    public void smoke() {
        System.out.println("抽烟有害健康");
    }
}
