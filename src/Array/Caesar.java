package Array;

import java.util.Scanner;

public class Caesar {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Zu verschlüsselnden Text eingeben:");

        String text = scanner.nextLine();

        System.out.println("Um wieviele Stellen soll verschoben werden? (1-127)");

        int offset = scanner.nextInt();

        if (offset >= 1 && offset <= 127) {

            char [] meinArray = text.toCharArray();

            char [] meinNeuesArray = verschluesseln(offset, meinArray);

            System.out.println("\nSo sieht der Text verschlüsselt aus:");

            for (char c : meinNeuesArray) {

                System.out.print(c);
            }
            System.out.println("\n");

            meinNeuesArray = entschluesseln(offset, meinNeuesArray);

            System.out.println("\nUnd so wieder zurück entschlüsselt:");

            for (char c : meinNeuesArray) {

                System.out.print(c);
            }
            System.out.println("\n");

            scanner.close();
        }
        else System.out.println("Die Verschiebung muss zwischen 1 und 127 liegen!");
    }

    public static char[] verschluesseln(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {

            int verschiebung = (charArray[i] + offset)%128;

            cryptArray[i] = (char) (verschiebung);

        }
        return cryptArray;

    }

    public static char[] entschluesseln(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];

        int verschiebung;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] - offset < 0)  verschiebung =
                    charArray[i] - offset + 128;

            else verschiebung = (charArray[i] - offset)%128;

            cryptArray[i] = (char) (verschiebung);

        }
        return cryptArray;

    }

}