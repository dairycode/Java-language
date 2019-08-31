package Java常用工具_API.String类的转换功能;

/*
    String类的转换功能:
        byte[] getBytes():          将字符串转换成字节数组
        char[] toCharArray():       将字符串转换成字符数组
        static String valueOf(..):  将指定类型数据转换成字符串
        String replace(old, new):   将指定字符(串)替换成新的字符(串)
        String[] split(String):     切割字符串,返回切割后的字符串数据,原字符串不变
        String trim():              去掉字符串两端的空白字符
 */
public class Test {
    public static void main(String[] args) {
        //定义一个字符串
        String s1 = "abc";

        //byte[] getBytes():          将字符串转换成字节数组
        byte[] bys = s1.getBytes();
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        System.out.println("---------------");
        //char[] toCharArray():       将字符串转换成字符数组
        char[] chs = s1.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println("---------------");

        //static String valueOf(..):  将指定类型数据转换成字符串
        //整数123 --> 字符串"123"
        String s2 = String.valueOf(123);
        System.out.println(s2 + 4);
        //在实际开发中,上述的方法基本上都会用下面的这行代码替换
        String s3 = "" + 123;
        System.out.println(s3+4);
        System.out.println("---------------");

        //String replace(old, new):   将指定字符(串)替换成新的字符(串)
        String s4 = "abc abc abc";
        //'d'替换'b'
        String s5 = s4.replace('b', 'd');
        System.out.println("s5:" + s5);
        System.out.println("---------------");

        //String[] split(String):     切割字符串,返回切割后的字符串数据,原字符串不变
        //将字符串s4,按照空格进行切割
        //"abc" "abc" "abc"
        String[] arr = s4.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------");

        //String trim():              去掉字符串两端的空白字符
        String s6 = " a  b  c ";
        String s7 = s6.trim();
        System.out.println("s6:" + s6);
        System.out.println("s7:" + s7);
    }
}
