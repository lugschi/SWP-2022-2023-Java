public class Crosssumexercise03 {

    public static int[] CrossSums = new int[Calculater(false) + 1];

    public static void main(String[] args) {
        Calculater(true);
        int highestNumber1 = 0;
        int highestNumber2 = 0;
        int highestEmergence = 0;

        for (int i = 0; i < CrossSums.length; i++){
            if (CrossSums[i] == highestEmergence)
                highestNumber2 = i;
            if (CrossSums[i] > highestEmergence) {
                highestNumber1 = i;
                highestEmergence = CrossSums[i];
            }
            System.out.println(i + ": " + CrossSums[i]);
        }

        System.out.println();
        if (highestNumber1 == highestNumber2 || highestNumber2 == 0)
            System.out.println("Highest Crosssum: " + highestNumber1);
        else
            System.out.println("Highest Crosssum: " + highestNumber1 + ", " + highestNumber2);
        System.out.println("Highest Emergence: " + highestEmergence);
    }

    public static int Calculater(boolean isFinished){
        int highestCrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int crs = i;
            while (crs > 0) {
                crossSum += crs % 10;
                crs /= 10;
            }
            if(crossSum > highestCrossSum) highestCrossSum = crossSum;
            if(isFinished) CrossSums[crossSum]++;
        }
        return highestCrossSum;
    }

}