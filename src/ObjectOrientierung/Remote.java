package ObjectOrientierung;
import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;



    public Remote () {
        this.batteries = new ArrayList<>();

    }




    public void addBattery(Battery batteries) {

        this.batteries.add(batteries);

    }


    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }

    public void getStatus() {
        double value1 = getBatteries().get(0).getBatteryCondition();
        double value2 = getBatteries().get(1).getBatteryCondition();
        double result = (value1 + value2)/2;
        System.out.println(result);
    }

    public void turnOn() {
        double value1 = getBatteries().get(0).getBatteryCondition();
        double value2 = getBatteries().get(1).getBatteryCondition();
        double result1 = value1 -5;
        double result2 = value2 -5;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

}


