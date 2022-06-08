public class Crosssumexercise02 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 1000; cnt++) {
            String Stingnumber = Integer.toString(cnt);
            char[] numbers = Stingnumber.toCharArray();

            int result = 0 * 7;
            for (int i = 0; i < numbers.length; i++) {
                result = result + Character.getNumericValue(numbers[i]);

            }
            int rest = result % 7;
            if (rest == 0) {
                System.out.println("Result: " + cnt + " Crosssum: " + result);
            }

        }
    }
}

