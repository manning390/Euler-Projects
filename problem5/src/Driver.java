/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int max = 20;
        int p = 1;
        int c;
        while(true){
            c = 0;
            for (int i = max; i > 0; i--){
                if(p % i == 0)
                    c++;
            }
            if(c == max)
                break;
            p++;
        }
        System.out.println(p);
    }
}
