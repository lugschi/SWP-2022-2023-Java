package ObjectOrientierung.Lamp;

public class Lamp {
    private String name;
    public enum COLOR{RED, GREEN, BLUE};
    private COLOR color;
    private int currentConsumption;
    private int status;

    public Lamp(String name, COLOR color, int currentConsumption, int status) {
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

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void turnOn() {
        if (this.status == 1) {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschalten.");
        } else {
            System.out.println("Mein Name ist " + this.name + ". Ich leuchte.");
        }
        System.out.println(this.currentConsumption + 5);
    }
}