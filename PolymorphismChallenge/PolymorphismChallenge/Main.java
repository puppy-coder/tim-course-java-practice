package PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari");
        runRace(car);

        Car ferrari = new GasPoweredCar("2023 red colour", 15.9, 6);
        runRace(ferrari);
        // Polymorphism doesn't just happen on methods we call directly. It also happens on methods
        //we call indirectly.
        // This means , that in essence, you can implement different behaviour on just portions
        //of a car's

        Car tesla = new ElectricCar("2022 Red tesla model 3", 568, 75);
        runRace(tesla);
        //Different behaviour at different objects at runtime

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }

}
