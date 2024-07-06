package Module;

public class Student {

String name;
int roll_no;

    public static void main(String[] args) {
        Student obj=new Student();
        obj.name="john";
        obj.roll_no=2;
        System.out.println(obj.name+" "+obj.roll_no);
    }
}