/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        StringBuilder s;
        int max = 0;
        for(int i = 999; i > 0; i--){
            if(String.valueOf(i).length() != 3)
                continue;
            for(int n = 999; n > 0; n--){
                if(String.valueOf(n).length() != 3)
                    continue;
                int p = i*n;
                if(p > max) {
                    s = new StringBuilder(String.valueOf(p));
                    if (s.toString().equals(s.reverse().toString())) {
                        System.out.println(p);
                        max = p;
                    }
                }
            }
        }
        System.out.println("Max: "+max);
    }
}
