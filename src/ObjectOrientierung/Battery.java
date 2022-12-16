package ObjectOrientierung;

public class Battery {
    private double batteryCondition;
    private int voltAmount;

    public Battery (double batteryCondition, int voltAmount ) {
        this.batteryCondition = batteryCondition;
        this.voltAmount = voltAmount;
    }

    public void setBatteryCondition(double batteryCondition) {
        this.batteryCondition = batteryCondition;
    }

    public double getBatteryCondition() {
        return batteryCondition;
    }

    public int getVoltAmount() {
        return voltAmount;
    }

    public void setVoltAmount(int voltAmount) {
        this.voltAmount = voltAmount;
    }







}
