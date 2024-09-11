package Module;

public class Students {
    String name;
    int rollNumber;
    String phoneNumber;
    String address;

    public static void main(String[] args) {
        Students sam = new Students();
        Students john = new Students();
        
        sam.name = "Sam";
        sam.rollNumber = 1;
        sam.phoneNumber = "7420939254";
        sam.address = "Pune";

        john.name = "John";
        john.rollNumber = 2;
        john.phoneNumber = "7420939254";
        john.address = "Pune";

        System.out.println(sam.name+" "+sam.rollNumber+" "+sam.phoneNumber+" "+sam.address);
        System.out.println(john.name+" "+john.rollNumber+" "+john.phoneNumber+" "+john.address);

    }
}
