package ObjectOrientierung.Car02;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private TYPE type;


    public Engine(TYPE type) {
        this.type = type;
    }
}
