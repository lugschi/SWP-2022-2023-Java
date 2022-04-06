import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        boolean isFinished = false;
        System.out.println("Drücken Sie 1 zum Starten und 2 zum beenden.");
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        while (!isFinished) {
            int Wert = 0;
            int selection = scanner.nextInt();
            int randomnumber = 0;
            if (selection == 1) {
                for (int i = 1; i <= 6; i++) {
                    randomnumber = random.nextInt(6) + 1;
                    Wert += randomnumber;
                    System.out.println("Sie haben eine " + randomnumber + " gewürfelt");
                }
                System.out.println("Ihr Wurf beträgt: " + Wert);

                int bot = 0;
                Random random1 = new Random();
                bot = random.nextInt(31) + 6;
                System.out.println("Der Botwurf beträgt " + bot);

                if (bot < Wert) {
                    System.out.println("Sie haben gewonnen!");

                } else if (bot > Wert) {
                    System.out.println("Sie haben verloren!");
                } else if (bot == Wert) {
                    System.out.println("Es ist ein Unentschieden!");
                }
            }

            if (selection == 2) {
                isFinished = true;
                System.out.println("Das Spiel wurde Erfolgreich beendet.");
            }

        }
    }
}
