package ObjectOrientierung;

public class Battery {
    private int batteryCondition;
    private int voltAmount;

    public Battery (int batteryCondition, int voltAmount ) {
        this.batteryCondition = batteryCondition;
        this.voltAmount = voltAmount;
    }

    public void setBatteryCondition(int batteryCondition) {
        this.batteryCondition = batteryCondition;
    }

    public int getBatteryCondition() {
        return batteryCondition;
    }

    public int getVoltAmount() {
        return voltAmount;
    }

    public void setVoltAmount(int voltAmount) {
        this.voltAmount = voltAmount;
    }







}
