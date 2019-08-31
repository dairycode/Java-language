package Java高级_反射.通过反射的方式获取成员方法并使用;

public class Student {
    //公共的空参方法
    public void show1() {
        System.out.println("我是公共的空参方法");
    }

    //公共的带参方法
    public void show2(int a) {
        System.out.println("我是公共的带参方法,您传入的a的值是:" + a);
    }

    //私有的带参方法
    private int show3(int a, int b) {
        System.out.println("我是私有的带参方法");
        return a + b;
    }
}
