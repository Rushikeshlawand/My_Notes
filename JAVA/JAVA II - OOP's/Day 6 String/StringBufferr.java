public class StringBufferr {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer();
        obj.append("Rushi");
        System.out.println(obj.toString());

        obj.insert(5, "Kesh");
        System.out.println(obj.toString());

        obj.replace(2, 4, "??");
        System.out.println(obj.toString());

        obj.delete(1, 2);
        System.out.println(obj.toString());

        obj.reverse();
        System.out.println(obj.toString());
    }
}