package Java核心_常量和变量;

public class ConversionDemo {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        //我可以把a+b的结果进行输出,说明这样计算是没有问题的
        int c = a + b;
        System.out.println(c);
        System.out.println("-----------------");

        //定义一个int类型的变量和一个byte类型的变量
        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        int cc = aa + bb;   //byte类型和int类型计算,会先将byte类型提升为int类型再计算
        System.out.println(cc);
        System.out.println("-----------------");

        //强制类型转换
        //目标类型 变量名 = (目标类型)要转换的值
        byte dd = (byte)(aa + bb);
        System.out.println(dd);
        System.out.println("-----------------");

        double d1 = 3.14;
        int a1 = (int)d1;   //将double类型结果强制转换成int类型
        System.out.println(a1);
    }
}
