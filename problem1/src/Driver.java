/**
 * Created by Michael Manning on 9/3/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int sum = 0;
        int iterator = 1000;
        while(iterator-- > 0){
            if(iterator % 5 == 0 || iterator % 3 == 0){
                sum+=iterator;
            }
        }
        System.out.println(sum);
    }
}
