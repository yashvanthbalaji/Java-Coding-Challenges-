package InheritanceTypes;

// Base class or Super class
class Car {
    int car_tyres = 4;
    int car_doors = 4;
    int car_sidemirrors = 2;
    String mode_of_transport = "Road ways";

    // Constructor
    Car() {
        System.out.println("Car properties:");
        System.out.println("Tyres: " + car_tyres);
        System.out.println("Doors: " + car_doors);
        System.out.println("Side Mirrors: " + car_sidemirrors);
        System.out.println("Mode of Transport: " + mode_of_transport);
        System.out.println();
    }
}

// Child class 1
class Audi extends Car {
    String audi_speed = "330 km/h";
    String audi_mileage = "13.4 kmpl";
}

// Child class 2
class Ford extends Car {
    String ford_speed = "250 km/h";
    String ford_mileage = "11 kmpl";
}

// Child class 3
class Ferrari extends Car {
    String ferrari_speed = "340 km/h";
    String ferrari_mileage = "7.7 kmpl";
}

// Driver class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Object of Audi class
        Audi obj1 = new Audi();
        System.out.println("Audi Speed: " + obj1.audi_speed);
        System.out.println("Audi Mileage: " + obj1.audi_mileage);
        System.out.println();

        // Object of Ferrari class
        Ferrari obj2 = new Ferrari();
        System.out.println("Ferrari Speed: " + obj2.ferrari_speed);
        System.out.println("Ferrari Mileage: " + obj2.ferrari_mileage);

        System.out.println("\nCode executed successfully!");
    }
}
