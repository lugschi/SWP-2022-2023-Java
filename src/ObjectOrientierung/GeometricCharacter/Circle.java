package ObjectOrientierung.GeometricCharacter;

public class Circle extends Shapes {
    private double radius;
    private String name;


    public Circle (double radius, String name){
        this.radius = radius;
        this.name = name;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


