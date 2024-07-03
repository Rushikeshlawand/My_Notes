public class student {
    void PrintName() {
        System.out.println("Hi");
    }

    static class newStudent extends student {
        void PrintName() {
            System.out.println("Hey");
        }
    }

    public static void main(String[] args) {
        newStudent obj = new newStudent();
        obj.PrintName();
    }
}