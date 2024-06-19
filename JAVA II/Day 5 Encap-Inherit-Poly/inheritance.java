public class inheritance {
    protected String name;
    protected int age;

    public inheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "is eating.");
    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + "makes a sound");
    }

    public class Dog extends inheritance {
        public Dog(String name, int age) {
            super(name, age); // Call the constructor of the base class
        }
    
        @Override
        public void makeSound() {
            System.out.println(name + " barks.");
        }
    
        public void fetch() {
            System.out.println(name + " is fetching the ball.");
        }
    }
    
}