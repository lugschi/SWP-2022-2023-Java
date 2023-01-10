package ObjectOrientierung.Car01;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 100);

        RearMirror r1 = new RearMirror(100, 40);
        RearMirror r2 = new RearMirror(100, -40);

        Tire t = new Tire(17, Tire.color.black);
        Tire t2 = new Tire(17, Tire.color.black);
        Tire t3 = new Tire(17, Tire.color.black);
        Tire t4 = new Tire(17, Tire.color.black);



        System.out.println(e1.getHorsePower() + "hp");

        e1.drive(100);
        System.out.println(r1.getSize());
        System.out.println(r2.getSize());

        Tank t1 = new Tank(70, 69);

        System.out.println(t1.getTankAmount() + "L");
        System.out.println(t1.getCurrentTank() + "L");


        Car c1 = new Car(e1, 6,"BMW", "BMW4321");
        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.addTires(t);
        c1.addTires(t2);
        c1.addTires(t3);
        c1.addTires(t4);
        System.out.println(c1.getMirrors().get(0).getPosition());

        Car c2 = new Car(e1, 7, "Audi", "Audi4321");

        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());

        c1.breaks();
        c1.turboBoost();
        c1.getRemainingRange();
        c1.honk(3);

        Car c3 = new Car(e1, 5, "Opel", "Opel1234");










    }
}
