package ObjectOrientierung;

public class ObjectO01 {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 100);

        System.out.println(e1.getHorsePower() + "hp");
        System.out.println(e1.getspeed() + "km/h" );

        Tank t1 = new Tank(70, 69);

        System.out.println(t1.getTankAmount() + "L");
        System.out.println(t1.getCurrentTank() + "L");


        Car c1 = new Car(e1, 6,"BMW", "BMW1234");

        Car c2 = new Car(e1, 7, "Nissan", "N4321");

        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());

        c1.breaks();
        c1.turboBoost();
        c1.getRemainingRange();
        c1.honk(3);

        Car c3 = new Car(e1, 4, "Opel", "1234O");











    }
}
