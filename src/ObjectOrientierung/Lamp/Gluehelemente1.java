package ObjectOrientierung.Lamp;

public class Gluehelemente1 {
    private String name;
    public enum COLOR{RED, GREEN, BLUE};
    private COLOR color;
    private int currentConsumption;
    private boolean status;


    public Gluehelemente1(String name, COLOR color, int currentConsumption, boolean status) {
        this.name = name;
        this.color = color;
        this.currentConsumption = currentConsumption;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public int getCurrentConsumption() {
        return currentConsumption;
    }

    public void setCurrentConsumption(int currentConsumption) {
        this.currentConsumption = currentConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
