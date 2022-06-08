public class Crosssumm1 {

    public static void main(String[] args) {
        int number= 69420;

        String Stingnumber = Integer.toString(number);
        char[] numbers = Stingnumber.toCharArray();

        int result = 0;
        for (int i = 0; i <numbers.length; i++) {
            result = result + Character.getNumericValue(numbers[i]);
            
        }
        System.out.println(result);
    }
}
