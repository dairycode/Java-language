package Java编程思想_面向对象之继承.demo4;

public class Test {
    public static void main(String[] args) {
        //需求:测试继承关系中,子父类间成员变量的使用
        Apple apple = new Apple();
        apple.showPrice();

        /*
            Java中使用变量的规则:
                遵循"就近原则",局部位置有就使用
                没有就去本类的成员位置找,有就使用
                没有就去父类的成员位置找,有就使用,没有就报错
         */
    }
}
