package ObjectOrientierung.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElement;


    public Lamp() {
        this.lightElement = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {

        this.lightElement.add(lightElement);

    }

    public void getLightElement() {
        for (int i = 0; i < lightElement.size(); i++) {
            System.out.println(lightElement.get(i).getName());

        }

    }

    public void setLightElement(List<LightElement> lightElement) {
        this.lightElement = lightElement;
    }

    public void turnAllOn() {
        for (int i = 0; i < lightElement.size(); i++) {
            if (lightElement.get(i).getStatus() == false) {
                lightElement.get(i).setStatus(true);
                System.out.println("Mein Name ist " + lightElement.get(i).getName() + ", ich Leuchte nun.");
            } else {
                System.out.println("Mein Name ist " + lightElement.get(i).getName() + ", ich bin bereits eingeschalten.");
            }
            System.out.println(lightElement.get(i).getCurrentConsumption() + 5);
        }
    }

    public void getOverallPowerUsage() {

        for (int i = 0; i < lightElement.size(); i++) {
            lightElement.get(i).getCurrentConsumption();
        }

    }

    public void printNameOfLightElements() {
        for (int i = 0; i < lightElement.size(); i++) {
            System.out.println(lightElement.get(i).getName());

        }
    }
}

