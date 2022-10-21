package ObjectOrientierung;

public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;
    public int range;

    public Car(int fuelConsumption, String brand, String serialNumber) {
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
            System.out.print("Tuut");
        }
    }


}
