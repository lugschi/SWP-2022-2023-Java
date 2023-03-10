package ObjectOrientierung.Phone;

public class Phonefile {
    private String extension;
    private double size;
    private String name;

    public Phonefile(String extension, double size, String name){
        this.extension = extension;
        this.name = name;
        this.size = size;
    }

    public void getInfo(){
        System.out.println(size);
        System.out.println(name);
        System.out.println(extension);

    }
}
