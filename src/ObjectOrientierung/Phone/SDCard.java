package ObjectOrientierung.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard{
    private int capacity;
    private List<Phonefile> phonefileList;
    private double size;

    public SDCard(int capacity, double size){
        this.size = size;
        this.capacity = capacity;
        this.phonefileList = new ArrayList<>();
    }

    public void saveFiles(Phonefile phonefileList){
        if (capacity > size){
            this.phonefileList.add(phonefileList);
        } else{
            System.out.println("Geht niiiiiicht!!!!!!!!!!");
        }

        }




    public void getAllFiles(){
        for (int i = 0; i <phonefileList.size(); i++) {
            System.out.println(phonefileList.get(i).toString());

        }
    }

    public int getFreeSpace(){
        return 0;
    }
}
