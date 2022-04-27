import java.util.Scanner;

public class exercise01 {

    public static void main(String[] args) {


        int[] number ={1,2,3,4,5,6,7,8,9,10};
        int result = 0;

        for (int i = 0; i < number.length; i++) {
            result += number[i];
            System.out.println(number[i]);
            System.out.println(result);


        }

    }
}
