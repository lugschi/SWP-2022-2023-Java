package ObjectOrientierung.Car01;

public class Tire {
    public enum color{silver, white, black};

    private int size;
    private color felloeColor;

    public Tire (int size, color felloeColor) {
        this.size = size;
        this.felloeColor = felloeColor;
    }

    public int getTireAmount() {
        return size;
    }

    public void setTireAmount(int tireAmount) {
        this.size = tireAmount;
    }

    public color getFelloeColor() {
        return felloeColor;
    }

    public void setFelloeColor(color felloeColor) {
        this.felloeColor = felloeColor;
    }









}
