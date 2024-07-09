public class StringBufferr {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer();
        obj.append("Hii");
        System.out.println(obj.toString());

        obj.insert(2, "kashi");
        System.out.println(obj.toString());

        obj.replace(2, 4, "///");
        System.out.println(obj.toString());

        obj.delete(1, 5);
        System.out.println(obj.toString());

        obj.reverse();
        System.out.println(obj.toString());
    }
}