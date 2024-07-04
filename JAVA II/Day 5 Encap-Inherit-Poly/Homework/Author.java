public class Author {

    private  String name;
    private String eMail;
    private char gender;
    
    Author(String name,String eMail, char  gender){
        this.eMail = eMail;
        this.gender=gender;
        this.name= name;
    }

    String getName(){
        return name;
    }

    String getMail(){
        return eMail;
    }

    void setMail(String eMail){
        this.eMail= eMail;
    }

    char getGender(){
        return gender;
    }

    void Details(){
        System.out.println(name +"("+ gender +")"+ eMail + "");
    }

    public static void main(String[] args) {
        Author obj = new Author("Ashpak", "ashpakpatel81@gmail.com", 'M');

        obj.Details();
    }
    
}
