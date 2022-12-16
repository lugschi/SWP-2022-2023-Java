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

        double batteryChange = getBatteries().get(0).getBatteryCondition() - 5;
            getBatteries().get(0).setBatteryCondition(batteryChange);
        double batteryChange2 = getBatteries().get(1).getBatteryCondition() - 5;
        getBatteries().get(1).setBatteryCondition(batteryChange);
        System.out.println("Verbraucher angeschlossen");
        System.out.println("Batterie 1: " + batteryChange);
        System.out.println("Batterie 2: " + batteryChange2);
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

}


