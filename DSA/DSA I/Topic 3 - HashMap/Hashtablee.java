import java.util.Hashtable;
import java.util.Map;

public class Hashtablee {

    public static void main(String[] args) {
        Hashtable<Integer, String> tb = new Hashtable<>();

        tb.put(10, "Ram");
        tb.put(1, "Sham");
        tb.put(11, "Rushikesh");
        tb.put(12, "Kiran");
        tb.put(13, "raj");

        // tb.remove(12);
        System.out.println(tb.containsKey(18));
        System.out.println(tb.containsValue("Ram"));
        System.out.println(tb.size());
        tb.put(11, "Rushi");
        // System.out.println(tb);

        for (Integer pt : tb.keySet()) {
            System.out.println(pt);
        }

        for (String pt : tb.values()) {
            System.out.println(pt);
        }
        for (Map.Entry<Integer, String> pt : tb.entrySet()) {
            System.out.println(pt.getKey() + " " + pt.getValue());
        }
    }
}