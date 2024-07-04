public class Book {

    private String  name;
    private String author;
    private double  price;
    private int quantity;

    String getName(){
        return  name;
    }

    String getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price= price;
    }
    int getquantity(){
        return quantity;
    }
    void setQuantity( int quantity){
        this.quantity = quantity;
    }

    void Details(){
        System.out.println(name+"by"+author);
    }

    
}
