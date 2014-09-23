import java.util.ArrayList;

/**
 * Created by Michael Manning on 9/3/2014.
 */
public class Driver {
    public static void main(String[] args) {
        long given =  600851475143L;
        double rootStop = Math.sqrt(given);
        long iterator = 5;
        boolean divisibleStop;
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(3L);

        while(iterator < given){
            divisibleStop = true;
            for(long prime : primes){
                //If all lower prime numbers exceed the square root of the number searching for, it is a prime
                if(prime > Math.sqrt(iterator)){
                    break;
                }
                //If number is divisible by a prime, it isn't prime
                if((iterator % prime) == 0){
                    divisibleStop = false;
                    break;
                }
            }
            //Prime number found, add it to the list
            if(divisibleStop) {
                primes.add(iterator);
                System.out.println(iterator);
                //The largest prime can't exceed the sqrt of the any of the prime factors of the given number
                if(iterator >= rootStop){
                    break;
                }
            }

            iterator+=2;
        }
        //Search for the largest factor with the required primes
        for(int n = primes.size()-1;n >= 0; n--){
            if((given % primes.get(n)) == 0){
                System.out.println("Result: "+primes.get(n));
                break;
            }
        }
        //Fun statistics
        System.out.println("Primes: "+primes.toString());
        System.out.println("# of primes: "+primes.size());
    }
}
