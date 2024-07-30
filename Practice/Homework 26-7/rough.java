public class rough {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        String A = "Geeksfo";
        String B = "rGeeks";
        String n = "";
        n = A + B;
        if (s.equals(n)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        System.out.println(n);
    }
}