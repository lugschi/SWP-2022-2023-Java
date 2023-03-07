package ObjectOrientierung.GeometricCharacter;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(12, "Circle");
        System.out.println(c1.getArea());
        System.out.println(c1.getName());

        Quadrat q1 = new Quadrat(5, 6, "Quadrat");
        System.out.println(q1.getArea());
        System.out.println(q1.getName());

        Recktangle r1 = new Recktangle(5, 6, "Recktangle");
        System.out.println(r1.getArea());
        System.out.println(r1.getName());

        Cube cu1 = new Cube(4, 5, 6, "Cube");
        System.out.println(cu1.getArea());
        System.out.println(cu1.getName());




    }


}
