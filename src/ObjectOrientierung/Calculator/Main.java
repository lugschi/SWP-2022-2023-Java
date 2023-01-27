package ObjectOrientierung.Calculator;

public class Main {
    public static void main(String[] args) {
        basicCalculation b1 = new basicCalculation();

        System.out.println(b1.addition(121, 29));
        System.out.println(b1.subtract(171, 21));
        System.out.println(b1.multiply(5, 30));
        System.out.println(b1.divide(450, 3));

        scienceCalculator s1 = new scienceCalculator();

        System.out.println(s1.sinus(100, 5));
        System.out.println(s1.cosinus(50, 12));
        System.out.println(s1.addition(12, 13));

        rootCalculator r1 = new rootCalculator();

        System.out.println(r1.root(15, 10));
        System.out.println(r1.multiply(5, 5));

    }
}
