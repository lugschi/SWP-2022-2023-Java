package ObjectOrientierung;

public class Tire {
    private int tireAmount;
    private enum color {silver, white, black};
    private color felloeColor;


    public Tire (int tireAmount, color felloeColor) {
        this.tireAmount = tireAmount;
        this.felloeColor = felloeColor;
    }


}
