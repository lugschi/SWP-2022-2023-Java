import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        String Month = "falscher Eingabewert",
                Day = "falscher Eingabewert";
        int max = 31;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib einen Monat ein:");
        int m = scanner.nextInt();
        int startDay = 0;
        String[] weekDays = {"MO", "TU", "WE", "TH", "FR", "SA", "SU"};


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

            System.out.print(weekDays[i]);
            i++;

            if (i == 7) System.out.println(" |");
        }
        i = 0;

        System.out.println("");
        System.out.println("Month");
        System.out.println("");
        System.out.println("MO TU WE TH FR SA SU");

        while (t < max + startDay + 7 - (max + startDay) % 7) {
            if (t % 7 == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");

            if (t < startDay || t > max + startDay - 1) System.out.print("  ");
            else System.out.print(t - startDay + 1);

            if (t - startDay + 1 < 10 && t >= startDay) System.out.print(" ");
            t++;

            if (t % 7 == 0) System.out.println(" |");
        }




    }
}
