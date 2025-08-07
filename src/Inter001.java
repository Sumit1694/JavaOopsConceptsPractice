interface Cars {
    public void start();
}

// Class 1 implementing Cars
class ElectricCar implements Cars {
    @Override
    public void start() {
        System.out.println("Electric car starts");
    }
}

// Class 2 implementing Cars (move it outside of ElectricCar)
class DieselCar implements Cars {
    @Override
    public void start() {
        System.out.println("Diesel car starts");
    }
}

// Main class
public class Inter001 {
    public static void main(String[] args) {
        Cars tesla = new ElectricCar();     // Polymorphism
        Cars xuv700 = new DieselCar();      // Polymorphism

        tesla.start();   // Output: Electric car starts
        xuv700.start();  // Output: Diesel car starts
    }
}