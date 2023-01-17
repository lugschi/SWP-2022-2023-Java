package ObjectOrientierung.Lamp;


public class Main {
    public static void main(String[] args) {
        Lamp l1 = new Lamp("Hansi", Lamp.COLOR.RED,100, 0);
        Lamp l2 = new Lamp("Peter", Lamp.COLOR.GREEN, 110, 1);

        l1.turnOn();
        l2.turnOn();
    }
}
