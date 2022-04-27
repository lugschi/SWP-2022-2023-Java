import java.util.Random;
import java.util.Scanner;
public class exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int result = 0;
        int[] randomNumber = new int [50];
        int number =0;



            for (int i = 0; i <randomNumber.length; i++) {
                number = random.nextInt(100);
                randomNumber[i] = number;
                result += randomNumber[i];
                System.out.println(randomNumber[i]);
                System.out.println(result);

            }
        }
    }
