package ObjectOrientierung;

public class Tire {
    public enum color{silver, white, black};

    private int tireAmount;
    private color felloeColor;

    public Tire (int tireAmount, color felloeColor) {
        this.tireAmount = tireAmount;
        this.felloeColor = felloeColor;
    }

    public int getTireAmount() {
        return tireAmount;
    }

    public void setTireAmount(int tireAmount) {
        this.tireAmount = tireAmount;
    }

    public color getFelloeColor() {
        return felloeColor;
    }

    public void setFelloeColor(color felloeColor) {
        this.felloeColor = felloeColor;
    }









}
