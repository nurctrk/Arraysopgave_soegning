public class IterateThroughArray {
    public static void main(String[] args) {
        double[] a ={4.5, 25.3, 12.1, 34.0, 15.5};
        for (int i = 0; i < a.length; i++) {
            double exponentialValue = Math.exp(a[i]);

            System.out.println("Value: " + a[i] + ", Exponential: " + exponentialValue);

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            if (a[i] > max)
            max = i;

            if (a[i] < min)
            min = i;

            System.out.println("Min: " + min + ", Max: " + max);

            //øvelse 8
            if (a[i] == 12.1)
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index" + " i: " + i);



        }
    }
}
