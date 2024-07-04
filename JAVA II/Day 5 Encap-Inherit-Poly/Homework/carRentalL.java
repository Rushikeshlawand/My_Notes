public class carRentalL {
    private int CarId;
    private String CarType;
    private float Rent;

    public void GetCar(int carId, String carType) {
        this.CarId = carId;
        this.CarType = carType;
        GetRent();
    }

    public void GetRent() {
        if (this.CarType.equals("Small Car")) {
            this.Rent = 1000.0f;
        } else if (this.CarType.equals("Van")) {
            this.Rent = 800.0f;
        } else if (this.CarType.equals("SUV")) {
            this.Rent = 2500.0f;
        } else {
            this.Rent = 0.0f; 
        }
    }

    public void ShowCar() {
        System.out.println("Car ID: " + this.CarId);
        System.out.println("Car Type: " + this.CarType);
        System.out.println("Rent: " + this.Rent);
    }
    public static void main(String[] args) {
        carRentalL carRental = new carRentalL();
        carRental.GetCar(1, "SUV");
        carRental.ShowCar();
    }
}

//Define a class CARRENTAL with the following details :
//Class Members are : CarId of int type, CarType of string type and Rent of float type
//Define GetCar() method which accepts CarId and CarType.
// GetRent() method which return rent of the car on the basis of car type, i.e. Small
//Car = 1000, Van = 800, SUV = 2500
// ShowCar() method which allow user to view the contents of cars i.e. id, type and
//rent.