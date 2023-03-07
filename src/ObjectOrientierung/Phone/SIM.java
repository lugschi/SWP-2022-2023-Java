package ObjectOrientierung.Phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number){
        this.id = id;
        this.number = number;
    }

    public String doCall(){
        return "-";
    }
}
