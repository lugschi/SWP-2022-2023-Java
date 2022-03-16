import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        boolean isFinished = true;


        Scanner scanner = new Scanner(System.in);


        int Kontostand = 0;


        while (isFinished){
            int selection = scanner.nextInt();
            if (selection == 1){
                System.out.println("Geben Sie den Betrag ein den Sie gerne einzahlen möchten:");
                selection = scanner.nextInt();
                Kontostand += selection;
                System.out.println("Sie haben " + Kontostand + " eingezahlt");


            }

            if(selection == 2){
                System.out.println("Geben Sie den Betrag ein den Sie gerne abheben möchten:");
                selection = scanner.nextInt();
                Kontostand -= selection;
                System.out.println("Sie haben " + selection + " abgehoben");

            } else if (Kontostand<0){
                System.out.println("error");
            }

            if(selection == 3){
                System.out.println("Der Kontostand beträgt " + Kontostand);
            }

            if(selection == 4){
                isFinished = false;
                System.out.println("Machine is stopping");


            }
        }

    }



}

