abstract class CarFunction {
    abstract void CarStartButton();
    abstract void CarSpeedMeter();

    void wheel() {
        System.out.println("4 wheels");
    }
}

class RangeRover extends CarFunction {
    void CarStartButton() {
        System.out.println("Start range rover");
    }

    void CarSpeedMeter() {
        System.out.println("speed of car");
    }
}

class Audi extends CarFunction {
    void CarStartButton() {
        System.out.println("Start audi");
    }

    void CarSpeedMeter() {
        System.out.println("speed of car");
    }
}

public class abstraction {
    public static void main(String[] args) {
        CarFunction obj = new RangeRover();
        obj.CarStartButton();
        obj.CarSpeedMeter();
        obj.wheel();

        CarFunction obj1 = new Audi();
        obj1.CarStartButton();
        obj1.CarSpeedMeter();
        obj1.wheel();
    }
}
