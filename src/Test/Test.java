package Test;

import java.util.Random;

public class Test {

    public static void main(String[] args) {
        int randomNumber1;
        int randomNumber2;

        Random random = new Random();
        randomNumber1 = random.nextInt(1001);
        randomNumber2 = random.nextInt(1001);

        if (randomNumber1 > randomNumber2) {
            for (int i = randomNumber1; i >= randomNumber2; i--) {
                System.out.println(randomNumber1);
                randomNumber1 = randomNumber1 - 1;
            }
        } else if (randomNumber2 > randomNumber1) {
            for (int i = randomNumber2; i >= randomNumber1; i--) {
                System.out.println(randomNumber2);
                randomNumber2 = randomNumber2 - 1;
            }
        }
    }
}


