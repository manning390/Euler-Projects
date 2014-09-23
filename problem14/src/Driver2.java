/**
 * Created by Michael Manning on 9/11/2014.
 */
public class Driver2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int max = 0;
        int maxIndex = 1;
        int range = 1000000;
        int length,n;
        for(int i=2; i <= range; i++){
            length = 0;
            n = i;
            while(n != 1) {
                if ((n % 2) == 0) {
                   n /= 2;
                }else {
                    n = 3 * n + 1;
                }
                length++;
            }
            if(length > max){
                max = length;
                maxIndex = i;
            }
        }
        System.out.printf("The longest chain was %d with a length of %d%n", maxIndex, max);
        System.out.println(System.nanoTime() - startTime);
    }
}
