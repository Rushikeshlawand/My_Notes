import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char[] name1 = name.toCharArray();
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < name1.length; i++) {
            if (i + 1 < name1.length && name1[i] == name1[i + 1]) {
                count++;
            } else {
                compressed.append(name1[i]);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1; 
            }
        }

        System.out.println(compressed.toString());
    }
}