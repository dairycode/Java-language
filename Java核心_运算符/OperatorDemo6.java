package Java核心_运算符;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //案例:韦小宝找媳妇

        //刚开始眼光比较高,要求既要长得好看,还要身材好
        //前边的true表示:长得好看 flase表示:长得不好看
        //后边的true表示:身材好 flase表示:身材不好
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println("---------------");

        //韦小宝发现那样的媳妇不好找,于是降低了择偶标准,只要长得好看或者身材好
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("---------------");

        //韦小宝发现那样的媳妇不好找,于是降低了择偶标准,只要不是男的就好
        //true:女 flase:男
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("---------------");

        System.out.println(!!!!!!!true);

    }
}
