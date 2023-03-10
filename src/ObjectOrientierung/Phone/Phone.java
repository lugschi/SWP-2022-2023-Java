package ObjectOrientierung.Phone;

public class Phone {
    private String color;
    private SIM sim;
    private SDCard sdCard;
    private Camera camera;

    public Phone (String color, SIM sim, SDCard sdCard, Camera camera){
        this.color = color;
        this.camera = camera;
        this.sdCard = sdCard;
        this.sim = sim;
    }

    public void takePicture(){

    }

    public String makeCall(){
        return "-";
    }

    public int getFreeSpace(){
     return 0;
    }

    public void printAllFiles(){

    }
}
