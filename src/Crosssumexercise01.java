public class Crosssumexercise01 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1000; cnt++) {
            String Stingnumber = Integer.toString(cnt);
            char[] numbers = Stingnumber.toCharArray();

            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + Character.getNumericValue(numbers[i]);

            }

            if (result == 15) {
                System.out.println("Result: " + cnt + " Crosssum: " + result);
            }

        }
    }
}
