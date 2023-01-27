package ObjectOrientierung.Car02;

public class Truck extends Car{
    private String trailer;
    public Truck(COLOR color, int maxSpeed, int basePrice, int fuelConsumption, Producer producer, Engine engine, int kilometreCounter, String trailer) {
        super(color, maxSpeed, basePrice, fuelConsumption, producer, engine, kilometreCounter);
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        super.drive();

    }


    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
