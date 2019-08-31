package Java编程思想_面向对象之多态.demo7;

public class Manager extends Employee {
    public Manager() {}

    public Manager(String name, double salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    //奖金
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理喝着茶翘着二郎腿看着程序员写代码");
    }
}
