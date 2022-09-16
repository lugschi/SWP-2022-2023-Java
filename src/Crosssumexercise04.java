import java.util.InputMismatchException;
import java.util.Scanner;

public class Crosssumexercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = true;
        int result = 0;

        System.out.println("Geben Sie eine zweistellige Zahl ein!");

        while (isFinished) {
            result = scanner.nextInt();
            scanner.nextInt();
            isFinished = false;

        }

        int iterierte = result;

        while(result >9) {
            int crs = result;
            result = 0;
                while(crs > 0) {

                }
        }
    }
}