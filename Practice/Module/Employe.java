package Module;

import java.util.Scanner;

public class Employe {

    private int salary;
    private int workHours;

    public void getinfo(int salary, int workHours) {

        this.salary = salary;
        this.workHours = workHours;
    }

    public void AddSal() {
        if (this.salary < 500) {
            this.salary += 10;
        }
    }

    public void AddWork() {
        if (workHours > 6) {
            this.salary += 5;
        }
    }

    public int getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        Employe obj = new Employe();
        obj.getinfo(501, 9);
        obj.AddSal();
        obj.AddWork();
        System.out.println(obj.getSalary());
    }
}