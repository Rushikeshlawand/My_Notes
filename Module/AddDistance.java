package Module;

public class AddDistance {
    private int feet;
    private int inches;

    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public AddDistance addDistance(AddDistance other) {
        int totalInches = this.inches + other.inches;
        int extraFeet = totalInches / 12;
        int remainingInches = totalInches % 12;
        int totalFeet = this.feet + other.feet + extraFeet;
        return new AddDistance(totalFeet, remainingInches);
    }

    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        AddDistance d1 = new AddDistance(5, 9);
        AddDistance d2 = new AddDistance(3, 4);

        AddDistance d3 = d1.addDistance(d2);
        System.out.print("Total Distance: ");
        d3.display();
    }
}
