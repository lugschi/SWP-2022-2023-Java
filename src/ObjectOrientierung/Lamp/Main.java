package ObjectOrientierung.Lamp;


import ObjectOrientierung.Remote.Remote;

public class Main {
    public static void main(String[] args) {


        LightElement e1 = new LightElement("Hans", LightElement.COLOR.RED, 4, true);
        LightElement e2 = new LightElement("Peter", LightElement.COLOR.BLUE, 3, false);


        Lamp l1 = new Lamp();
        l1.addLightElement(e1);
        l1.addLightElement(e2);

        /*l1.getLightElement();*/
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNameOfLightElements();




    }
}
