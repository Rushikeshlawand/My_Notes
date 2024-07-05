abstract class Animal {
    abstract void sound();
    
    void run() {
        System.out.println("Run");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Roar");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Growl");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); // Output: Roar
        lion.run();   // Output: Run

        Animal tiger = new Tiger();
        tiger.sound(); // Output: Growl
        tiger.run();   // Output: Run
    }
}
