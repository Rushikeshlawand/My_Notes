public class Switch_String {
    public static void main(String args[]){
        String  fruit="Banana";

        switch(fruit){
            case "Apple":
            System.out.println("It's an apple");
            break;

            case "Banana":
            System.out.println("Its a banana");
            break;

            case "Greps": 
            System.out.println("Its greps");
            break;

            default:System.out.println("Unknown fruit");
        }
    }
}