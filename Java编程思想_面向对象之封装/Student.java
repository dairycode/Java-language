package Java编程思想_面向对象之封装;

/*
    定义一个学生类
 */
public class Student {
    //成员变量
    //姓名
    String name;
    //年龄
    private int age;

    //提供公共的访问方式,分别设置值,获取值
    //设置age的值
    public void setAge(int a) {
        //在这里,对age的值进行限定
        //这里虽然可以对age的值做限定,但是不用做
        //因为从前端传过来的数据本身就是已经校验过的合法的数据
        /*
        if(a > 200 || a <= 0) {
            //非法值
            age = 1;
        }else {
            age = a;
        }
        */
        age = a;
    }
    //获取age的值
    public int getAge() {
        return age;
    }

    //成员方法
    //学习
    public void study() {
        //局部变量
        //String name = "小黑";
        System.out.println(name + "正在学习...");
    }
}
