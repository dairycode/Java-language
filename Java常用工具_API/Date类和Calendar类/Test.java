package Java常用工具_API.Date类和Calendar类;

import java.util.Date;

/*
    Date类:
        简介:
            日期类,用于操作时间相关信息
        构造方法:
            Date():         构造一个日期对象,当前系统时间,精确到毫秒
            Date():         构造一个日期对象,时间为自"1970年1月1日00:00:00 GMT"起,至指定参数的毫秒数
        成员方法:
            long getTime(): 将日期对象转换成对应时间的毫秒值

        Calendar类:
            简介:
                日历类,用于操作日期相关信息
            成员方法:
                static Calendar getInstance():      根据当前系统时区和语言环境获取日历对象
                int get(int field):                 返回给定日历字段的值
                void set(int field, int value):     将给定的日历字段设置为指定的值
 */
public class Test {
    public static void main(String[] args) {
        //测试Date类
        //测试空参构造,采用当前操作系统的默认时间
        Date date1 = new Date();
        System.out.println("date1:" + date1);

        //获取当前操作系统时间的毫秒值
        long time = date1.getTime();
        System.out.println("time:" + time);

        //Thu Aug 22 23:41:49 CST 2019 --> 1566488509363
        //创建一个指定的时间
        Date date2 = new Date(1566488509363L);
        System.out.println("date2:" + date2);
    }
}
