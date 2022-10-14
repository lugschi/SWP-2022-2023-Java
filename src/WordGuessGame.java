import java.util.Scanner;

public class WordGuessGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] guessWords = {"laptop", "computer", "system"};


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
                String guess = scanner.next();
                while (guess.equals("laptop")) {
                    System.out.println("Rate mit Buchstaben was für ein Wort das sein könnte:");
                    if (guess.equals("a")) {
                        System.out.println(guessWord1[0] + "a" + guessWord1[2] + guessWord1[3] + guessWord1[4] + guessWord1[5]);
                    } else if (guess.equals("p")) {
                        System.out.println(guessWord1[0] + guessWord1[1] + "p" + guessWord1[3] + guessWord1[4] + guessWord1[5]);
                    } else if (guess.equals("t")) {
                        System.out.println(guessWord1[0] + guessWord1[1] + guessWord1[2] + "t" + guessWord1[4] + guessWord1[5]);
                    } else if (guess.equals("o")) {
                        System.out.println(guessWord1[0] + guessWord1[1] + guessWord1[2] + guessWord1[3] + "o" + guessWord1[5]);
                    } else if (guess.equals("laptop")) {
                        System.out.println("You Win!");
                    } else {
                        System.out.println("Incorrect Guess Try Again:");
                    }
                }

            }

            if (selection == 2) {
                System.out.println(guessWords[1]);
            }

            if (selection == 3) {
                System.out.println(guessWords[2]);
            }

            if (selection == 4) {
                isFinished = false;
            }
        }


    }


}

