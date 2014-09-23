import java.util.ArrayList;

/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int stopAt = 2000000;
        long iterator = 3;
        boolean divisibleStop;
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(2L);

        while(true){
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
            //Add the found primes to the list
            if(divisibleStop) {
                if(iterator > stopAt) {
                    break;

                }
                primes.add(iterator);
            }
            iterator+=2;
        }
        long add = 0;
        for(long q : primes){
            add += q;
        }
        System.out.println(add);
        System.out.println("Largest prime: "+primes.get(primes.size()-1));
        //Fun statistics
//        System.out.println("Primes: "+primes.toString());
//        System.out.println("# of primes: "+primes.size());
    }
}
