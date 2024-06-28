public class HRManagement {
    String name;
    int salary;
    String date;
    String Department;
    static String companyName="amazon";

HRManagement(String name1,int salary1,String date1,String Department1){
     name=name1;
     salary=salary1;
     date=date1;
     Department=Department1;
}
void print(){
    System.out.println(name);
    System.out.println(salary);
    System.out.println(date);
    System.out.println(Department);
    System.out.println(companyName);
    if (salary<20000){
        System.out.println((salary*110)/100);
    }else{
        System.out.println(salary);
    }
}
    public static void main(String[] args) {
    HRManagement print=new HRManagement("Rishi",10000,"12","staff");
    print.print();
    }
}
