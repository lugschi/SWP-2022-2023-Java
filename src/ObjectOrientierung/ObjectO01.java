package ObjectOrientierung;

public class ObjectO01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 6;
        c1.serialNumber = "A420";

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.fuelConsumption = 4;
        c2.serialNumber = "A069";

        System.out.println(c1.brand);
        System.out.println(c2.brand);
    }
}
