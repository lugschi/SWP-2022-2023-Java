import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        String Month = "falscher Eingabewert",
                Day = "falscher Eingabewert";
        int max = 31;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib einen Monat ein:");
        int m = scanner.nextInt();



        System.out.println("Geben Sie einen Tag an wo der Monat starten soll.");
        int t = scanner.nextInt();

        switch (m) {
            case 1:
                m = 1;
                Month = "January";
                max = 31;
                break;
            case 2:
                m = 2;
                Month = "Februar";
                max = 29;
                break;

            case 3:
                m = 3;
                Month = "March";
                max = 30;
                break;

            case 4:
                m = 4;
                Month = "April";
                max = 31;
                break;

            case 5:
                m = 5;
                Month = "May";
                max = 30;
                break;

            case 6:
                m = 6;
                Month = "June";
                max = 31;
                break;

            case 7:
                m = 7;
                Month = "July";
                max = 30;
                break;

            case 8:
                m = 8;
                Month = "August";
                max = 31;
                break;

            case 9:
                m = 9;
                Month = "September";
                max = 30;
                break;

            case 10:
                m = 10;
                Month = "October";
                max = 31;
                break;

            case 11:
                m = 11;
                Month = "November";
                max = 30;
                break;

            case 12:
                m = 12;
                Month = "December";
                max = 31;
                break;
        }

        int i = 0;

        while (i<7){
            if (i == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");


            i++;

            if (i == 7) System.out.println(" |");
        }
        int d = 0;

        System.out.println("");
        System.out.println("Month");
        System.out.println("");
        System.out.println("| MO | TU | WE | TH | FR | SA | SU | ");

        while (d < max + t + 7 - (max + t) % 7) {
            if (d % 7 == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");

            if (d < t || d > max + t - 1) System.out.print("  ");
            else System.out.print(d - t + 1);

            if (d - t + 1 < 10 && d >= t) System.out.print(" ");
            d++;

            if (d % 7 == 0) System.out.println(" |");
        }




    }
}
