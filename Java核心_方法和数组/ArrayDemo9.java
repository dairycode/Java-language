package Java核心_方法和数组;

public class ArrayDemo9 {
    public static void main(String[] args) {
        /*
            结论:
                1.基本类型的变量作为参数传递时,传的是值
                2.引用类型的变量作为参数传递时,传的是地址值
         */
        int x = 3;
        int y = 4;
        int z = sum(x, y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        a++;
        b++;
        return c;
    }
}
