package ObjectOrientierung.Phone;

public class Camera {
    public enum RESOLUTION{LOW, MEDIUM, HIGH};
    private RESOLUTION resolution;


    public Camera(RESOLUTION resolution){
        this.resolution = resolution;
    }

    public RESOLUTION getResolution() {
        return resolution;
    }

    public void setResolution(RESOLUTION resolution) {
        this.resolution = resolution;
    }
}
