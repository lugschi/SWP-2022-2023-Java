package Array;

public class exercise04 {
    public static void main(String[] args) {
        int tausch = 0;
        int[] feld = {8, 3, 2, 22, 8, 1};


        for (int i = 0; i < feld.length; i++) {

            for (int j = 0; j < feld.length - 1; j++) {

                if (feld[j] >= feld[j + 1]) {

                    tausch = feld[j];

                    feld[j] = feld[j + 1];

                    feld[j + 1] = tausch;
                }
            }
        }

        for (int i = 0; i < feld.length; i++) {

            System.out.print(feld[ i]);

        }


    }

}

