package Java高级_反射.通过反射的方式获取构造方法并使用;

import java.lang.reflect.Constructor;

/**
 * Class类
 *      成员方法:
 *          public Constructor getConstructor(Class... params)
 *              根据参数列表,获取对应的构造器对象(仅限公共构造函数)
 *          public Constructor getDeclaredConstructor(Class... params)
 *              根据参数列表,获取对应的构造器对象(包含私有构造函数)
 *          public Constructor[] getConstructors() 获取此类所有的构造函数(不含私有)
 *
 *      Constructor类:构造器类
 *          概述:属于java.base模块下的java.lang.reflect包下的类
 *
 *          成员方法:
 *              public String getName():                    获取构造函数名
 *              public T newInstances(Object... params):    根据次构造函数和指定参数创建对象
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //需求:通过反射的方式创建:Student类型的对象
        //1.获取Student类的字节码文件对象
        Class clazz = Class.forName("Java高级_反射.通过反射的方式获取构造方法并使用.Student");
        /*
        //2.根据第一步获取到的字节码文件对象,获取指定的构造器对象
        //2.1获取公共的无参构造
        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);

        //2.2获取公共的有参构造
        Constructor con2 = clazz.getConstructor(String.class);
        System.out.println(con2);

        //2.3获取私有的的有参构造
        Constructor con3 = clazz.getDeclaredConstructor(int.class);
        System.out.println(con3);

        //2.4获取Student类的所有公共的构造函数
        System.out.println("---------------------------------------------------------");
        Constructor[] cons = clazz.getConstructors();
        //遍历数组
        for (Constructor con : cons) {
            System.out.println(con);
        }
         */

        //2.2获取公共的有参构造
        Constructor con2 = clazz.getConstructor(String.class);
        System.out.println(con2);

        //获取构造器的名字,看看他是哪个类的构造
        String name = con2.getName();
        System.out.println(name);

        //3.根据构造器对象和参数,创建对应的Student对象
        Student stu = (Student)con2.newInstance("张三");

        //4.打印结果
        System.out.println(stu);
    }
}
