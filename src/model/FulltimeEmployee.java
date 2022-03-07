package model;

public class FulltimeEmployee extends Employee implements Comparable<FulltimeEmployee> {
    private int bonus;
    private int finemoney;
    private int baseSalary;

    @Override
    public int compareTo(FulltimeEmployee o) {
        if (getNetSalary() > o.getNetSalary()) return 1;
        else if (getNetSalary() < o.getNetSalary()) return -1;
        else return 1;
    }

    @Override
    public double getNetSalary() {
        double result = baseSalary + (bonus - finemoney);
        return result;
    }


    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonus, int finemoney, int baseSalary) {
        this.bonus = bonus;
        this.finemoney = finemoney;
        this.baseSalary = baseSalary;
    }

    public FulltimeEmployee(String employeeId, String fullName, int age, String phoneNumber, String email, int bonus, int finemoney, int baseSalary) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.finemoney = finemoney;
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFinemoney() {
        return finemoney;
    }

    public void setFinemoney(int finemoney) {
        this.finemoney = finemoney;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public String toString() {
        return "FulltimeEmployee: {" +
                super.toString()+
                "bonus: " + bonus +
                ", finemoney: " + finemoney +
                ", baseSalary: " + baseSalary +
                '}';
    }
}
