package ObjectOrientierung.GeometricCharacter;


public class CharacterForm extends Character {
    private String name;
    private int width;
    private int length;
    private int height;
    private int radius;



    public CharacterForm(String name, int width, int lenght, int height, int radius) {
        this.name = name;
        this.width = width;
        this.radius = radius;
        this.length = lenght;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

