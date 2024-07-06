package Module;

import java.util.Scanner;

public class Employe {

    private int totalSalary;
    private int salary;
    private int workHours;

    void getinfo(int salary, int totalSalary, int workHours) {
        this.totalSalary = totalSalary;
        this.salary = salary;
        this.workHours = workHours;
    }

    void AddSal(int salary) {
        if (salary < 500) {
            totalSalary = salary + 10;
        } else {
            totalSalary = salary + 0;
        }
    }

    void AddWork(int workHours, int totalSalary) {
        if (workHours > 6) {
            int totalSalary1 = totalSalary + 5;
            System.out.print("Total: " + totalSalary1);
        }
    }

    public static void main(String[] args) {
        Employe obj = new Employe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary & work hours: ");
        int salary = sc.nextInt();
        int workHours = sc.nextInt();
        obj.AddWork(workHours, salary);
    }
}
