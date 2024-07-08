public class StringsName{
    public static void main(String[] args) {
        String Name="Rushikesh";
        String Name1=new String("Lawand");

        System.out.println(Name+" "+Name1);
        System.out.println(Name.concat(Name1));

        boolean isPresent=Name.contains("Rushikesh");
        System.out.println(isPresent);

        System.out.println(Name.indexOf("R"));
    }
}
