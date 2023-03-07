package ObjectOrientierung.GeometricCharacter;

public class Quadrat extends Shapes {
    private double width;
    private double length;
    private String name;

    public Quadrat(double width, double length, String name){
        this.name = name;
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String getName() {
        return name;
    }
}
