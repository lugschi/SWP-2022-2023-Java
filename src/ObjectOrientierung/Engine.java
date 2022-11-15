package ObjectOrientierung;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    private int horsePower;
    private TYPE type; // Diesel oder Benzin
    private int speed;

    public Engine(int horsePower, TYPE type, int speed) {
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
    }

    /*
     * amount should be between 0 and 100
     */
    public void drive(int speed) {

        System.out.println("The speed equals" + speed + "km/h");
    }


    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getspeed() {
        return speed;
    }

    ;


}
