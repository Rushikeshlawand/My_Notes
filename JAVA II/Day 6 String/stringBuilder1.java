import java.util.*;
public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder();
        obj.append("Rushi");
        System.out.println(obj.toString());
        obj.insert(5, "Kesh");
        System.out.println(obj.toString());
        obj.replace(2, 3, "-");
        System.out.println(obj.toString());
        obj.reverse();
        obj.delete(1, 3);
        System.out.println(obj.toString());
        System.out.println(obj.length());
    }
}