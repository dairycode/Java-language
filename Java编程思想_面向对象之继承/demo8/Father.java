package Java编程思想_面向对象之继承.demo8;

/*
 * 四大权限修饰词
 *              本类:     同包下的类:      不同包下的子类:        不同包下的无关类
 * private:     Y
 * 默认:         Y           Y
 * protected:   Y           Y               Y
 * public:      Y           Y               Y                   Y
 *
 * 总结;
 * private: 强调的是给自己来使用
 * 默认: 强调的是给同包下的来使用
 * protected: 强调的是给子类使用
 * public: 强调的是给大家使用
 */
public class Father {
    private void show1() {
        System.out.println("show1 private");
    }

    void show2() {
        System.out.println("show2 默认");
    }

    protected void show3() {
        System.out.println("show3 protected");
    }

    public void show4() {
        System.out.println("show4 public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
