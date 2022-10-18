package Array;

public class Array {
    public static void main(String[] args) {
        int[][] playGround = new int[3][3];

        playGround[0][0] = 1;
        playGround[1][1] = 2;
        playGround[1][2] = 2;
        playGround[1][0] = 2;

        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");
            }
            System.out.println();
        }

    }
}
