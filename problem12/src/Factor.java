import java.util.ArrayList;

/**
 * Created by Michael Manning on 9/5/2014.
 */
public class Factor {
    public static void main(String[] args) {
        findFactors(3);
        System.out.println();
        findFactors(12);
        System.out.println();
        findFactors(60);
        System.out.println();
        findFactors(18);
        System.out.println();
    }

    public static void findFactors(int n){
//        System.out.println("N: "+n);
        int numberOfFactors = 0;
        int c = 0;
        // Print the number of 2s that divide n
        while (n%2 == 0)
        {
//            System.out.printf("%d ", 2);
            c++;
            n = n/2;
        }
        if(c > 0){
//            System.out.println("> "+(c+1));
            if(numberOfFactors > 0)
                numberOfFactors *= (c+1);
            else
                numberOfFactors = (c+1);
        }


        // n must be odd at this point.  So we can skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i = i+2)
        {
            c = 0;
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
//                System.out.printf("%d ", i);
                c++;
                n = n/i;
            }
            if(c > 0) {
//                System.out.println(" > " +(c+1));
                if(numberOfFactors > 0)
                    numberOfFactors *= (c+1);
                else
                    numberOfFactors = (c+1);
            }
        }

        // This condition is to handle the case when n is a prime number
        // greater than 2
        if (n > 2) {
            if(numberOfFactors > 0)
                numberOfFactors *= 2;
            else
                numberOfFactors = 2;
        }
        System.out.println();
        System.out.printf("Number of factors: %d%n", numberOfFactors);
    }
}