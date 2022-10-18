package Test;

import java.util.Random;

public class Test2 {

    public static void main(String[] args) {
        boolean isFinished = true;
        int result = 0;

        while (isFinished){

            int randomnumber;
            Random random = new Random();
            randomnumber = random.nextInt(11);

            result = result + randomnumber;

            if (randomnumber == 5){
                break;
            }

        }
        System.out.println(result);
    }
}