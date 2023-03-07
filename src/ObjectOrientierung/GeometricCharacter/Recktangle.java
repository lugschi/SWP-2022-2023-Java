package ObjectOrientierung.GeometricCharacter;

public class Recktangle extends Shapes {
    private double length;
    private double width;
    private String name;

    public Recktangle(double length, double width, String name){
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
