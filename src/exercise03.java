import java.util.Arrays;

public class exercise03 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 2, 22, 8, 1};

        Arrays.parallelSort(numbers, 0, 6);
        for (int i : numbers) {
            System.out.print(i + " ");

        }
    }
}



