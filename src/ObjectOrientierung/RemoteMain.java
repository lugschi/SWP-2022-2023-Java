package ObjectOrientierung;

import java.util.ArrayList;

public class RemoteMain {
    public static void main(String[] args) {

        Battery b1 = new Battery(100, 6);
        Battery b2 = new Battery(100, 6);



        Remote r1 = new Remote ();
        r1.addBattery(b1);
        r1.addBattery(b2);

        r1.turnOn();
        r1.getStatus();

        r1.turnOff();




    }
}
