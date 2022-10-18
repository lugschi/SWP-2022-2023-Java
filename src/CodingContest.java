import java.util.Scanner;

public class CodingContest {
    public static void main(String[] args) {
        String[] guessWords = {"laptop", "computer", "system"};
        Scanner scanner = new Scanner(System.in);

        boolean isFinished = true;

        System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein oder 4 zum Aufgeben:");


        while (isFinished) {
            int selection = scanner.nextInt();
            if (selection == 1) {
                char[] guessWord1 = guessWords[0].toCharArray();
                guessWord1[0] = 'l';
                guessWord1[1] = '*';
                guessWord1[2] = '*';
                guessWord1[3] = '*';
                guessWord1[4] = '*';
                guessWord1[5] = 'p';
                System.out.println(guessWord1);
                String guess = scanner.nextLine();

                if (guess.equals("a")) {
                    System.out.println(guessWord1.equals("a"));
                } else if (guess.equals("p")) {
                    System.out.println(guessWord1.equals("p"));
                } else if (guess.equals("t")) {
                    System.out.println(guessWord1.equals("t"));
                } else if (guess.equals("o")) {
                    System.out.println(guessWord1.equals("o"));
                } else {
                    System.out.println("Incorrect Guess");
                }


            }
        }
    }
}
