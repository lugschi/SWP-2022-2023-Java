package ObjectOrientierung;


public class Car {
    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int range;


    public Car(Engine engine, int fuelConsumption, String brand, String serialNumber) {
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }




    // Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void breaks() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount >= this.fuelAmount * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go Super Boost");
        }
    }

    public void getRemainingRange() {

        range = fuelAmount / fuelConsumption;
        System.out.println(range +"km");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.print("ich bin ein" + this.brand + " und habe einen Tank");
        }
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount>100) {
            this.fuelAmount=100;
        } else {
            this.fuelAmount = fuelAmount;
        }

    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getRange() {
        return range;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


}