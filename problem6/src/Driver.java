/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int i = 100;
        int y = 0;
        int x = (int) Math.pow((i*(i+1))/2, 2);
        for(int n = i; n > 0; n--){
            y += Math.pow(n,2);
        }
        System.out.println(x-y);
    }
}
