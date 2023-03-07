package ObjectOrientierung.GeometricCharacter;

public class Cube extends Shapes{
    private double length;
    private double height;
    private double width;
    private String name;

    public Cube(double length, double width, double height, String name){
        this.height = height;
        this.length = length;
        this.width = width;
        this.name = name;
    }


    @Override
    public double getArea() {
        return length * height * width;
    }

    @Override
    public String getName() {
        return name;
    }
}
