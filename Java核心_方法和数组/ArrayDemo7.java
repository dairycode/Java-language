package Java核心_方法和数组;

public class ArrayDemo7 {
    public static void main(String[] args) {
        //需求:给定一个int型数组,找出它的最大元素
        //1.定义int[]
        int[] arr = {1, 3, 5, 2, 4, 6};
        //2.定义一个临时变量temp,用来表示最大值
        int temp = arr[0];
        //3.通过for循环遍历数组,获取每一个数据
        for(int i = 0; i < arr.length; i++) {
            //arr[i]表示的就是数组中的每一个数据
            //4.把获取到的数据依次和temp进行比较,并将较大的值赋值给temp
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }

        //5.for循环执行结束后,temp记录的就是最大值,打印即可
        System.out.println("数组中的最大元素为:" + temp);
    }
}
