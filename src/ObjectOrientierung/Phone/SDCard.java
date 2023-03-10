package ObjectOrientierung.Phone;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Phonefile>phonefiles;

    public SDCard(int capacity){
        this.capacity = capacity;
        this.phonefiles = new ArrayList<>();
    }

    public void saveFiles(Phonefile phonefiles){
            this.phonefiles.add(phonefiles);
        }




    public void getAllFiles(){
        for (int i = 0; i <phonefiles.size(); i++) {
            System.out.println(phonefiles.get(i).toString());

        }
    }

    public int getFreeSpace(){
        return 0;
    }
}
