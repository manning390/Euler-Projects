/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int stop = 1000;
        int i = 2;
        long t;//Triangle sum
        int result;
        int max = 0;
        while(true){
           t = (i*(i+1))/2;//Get triangle sum from i
           result = findFactors(t);
           if (result > max) {
               max = result;
               System.out.printf("i: %d > %d > %d%n",i,t,result);
           }
           if (max > stop)
               break;
           i++;
        }

    }

    public static int findFactors(long n){
        int numberOfFactors = 0;
        int c;

        //Find 2's
        c = 0;
        while (n%2 == 0)
        {
            c++;
//            System.out.println(2+" ");
            n = n/2;
        }
        if(c > 0){
            if(numberOfFactors > 0)
                numberOfFactors *= (c+1);
            else
                numberOfFactors = (c+1);
        }

        //Find other primes
        for (int i = 3; i <= Math.sqrt(n); i = i+2)
        {
            c = 0;
            while (n%i == 0)
            {
//                System.out.println(3+" ");
                c++;
                n = n/i;
            }
            if(c > 0) {
                if(numberOfFactors > 0)
                    numberOfFactors *= (c+1);
                else
                    numberOfFactors = (c+1);
            }
        }

        //If last number is prime
        if (n > 2) {
//            System.out.println(n+"");
            if(numberOfFactors > 0)
                numberOfFactors *= 2;
            else
                numberOfFactors = 2;
        }

        return numberOfFactors;
    }
}
