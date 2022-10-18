package Array;

import java.util.Scanner;

public class Crosssumexercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = true;
        int result = 0;

        System.out.println("Geben Sie eine zweistellige Zahl ein!");

        while(isFinished) {
                result = scanner.nextInt();
                scanner.nextLine();
                isFinished = false;
        }


        int quersum = result;
        while(result >9) {
            int crs = result;
            result = 0;
                while(crs > 0) {
                    result +=crs % 10;
                    crs /= 10;
                }
        }
        System.out.println("Die Quersumme von " + quersum + " ist " + result);
    }
}