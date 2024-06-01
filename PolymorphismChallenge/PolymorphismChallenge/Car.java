package PolymorphismChallenge;

public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Engine Start");
    }
    public void drive(){
        System.out.println("Driving car "+ getClass().getSimpleName()); // To get runtime object
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Engine run");
    }

}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinder;
    }

    @Override
    public void startEngine(){
        System.out.printf("All %d cylinders are fired up %n" , cylinders);
    }

    @Override
    protected void runEngine(){
        System.out.printf("Usage exceeds the average: %2f", avgKmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description){
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override // Override keyword --> SafeGuarding from Invalid method signature
    public void startEngine(){
        System.out.printf("BEV -> switch %d kwh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine(){
        System.out.printf("Gas -> usage exceeds the average: %2f %n", avgKmPerCharge);
    }

}

class HybridCar extends Car{
    private double avgKmPerLite;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description){
        super(description);
    }
    public HybridCar(String description, double avgKmPerLite, int batterySize, int cylinders){
        super(description);
        this.avgKmPerLite = avgKmPerLite;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kwh battery on, Ready!%n", batterySize);
    }


    public void runEngine(){
        System.out.printf("Hybrid -> usage below average: %2f %n", avgKmPerLite);
    }

}
