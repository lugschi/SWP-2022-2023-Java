package ObjectOrientierung.Car02;

import javax.swing.plaf.ColorUIResource;

public class Car {
    public enum COLOR {BLACK, WHITE, RED};
    private COLOR color;
    private int maxSpeed;
    private int basePrice;
    private int fuelConsumption;
    private Producer producer;
    private Engine engine;


    public Car(COLOR color, int maxSpeed, int basePrice, int fuelConsumption, Producer producer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.fuelConsumption = fuelConsumption;
        this.producer = producer;
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }





}
