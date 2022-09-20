public class Modulo {
    public static void main(String[] args) {
        int number = 543368;

        while(number > 0) {
            int lastNumber = number % 10;
            System.out.println(lastNumber);
            number = number / 10;
        }
    }
}
