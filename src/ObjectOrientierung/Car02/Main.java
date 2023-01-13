package ObjectOrientierung.Car02;

public class Main {

    Producer p1 = new Producer("Fritz", "Austria", 0.12);
    Producer p2 = new Producer("Hans", "Germany", 0.15);

    Engine e1 = new Engine(Engine.TYPE.DIESEL);
    Engine e2 = new Engine(Engine.TYPE.GAS);

    Car c1 = new Car(Car.COLOR.BLACK,125,45000,6, p1, e1, 0);
    Car c2 = new Car(Car.COLOR.WHITE, 150, 57000, 7, p2, e2, 0);




}
