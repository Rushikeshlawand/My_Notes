import java.util.*;

public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder();
        obj.append("Hiii");
        System.out.println(obj.toString());
        obj.insert(2, "How");
        System.out.println(obj.toString());
        obj.replace(2, 6, "---");
        System.out.println(obj.toString());
        obj.reverse();
        obj.delete(1, 3);
        System.out.println(obj.toString());
        System.out.println(obj.length());
    }
}