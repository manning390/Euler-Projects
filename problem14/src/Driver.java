import java.util.HashMap;

/**
 * Created by Michael Manning on 9/9/2014.
 */
public class Driver {
    public HashMap<Integer, Integer> storage = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        Driver d = new Driver();
        int max = 0;
        int maxi = 0;
        int i,n,k;
        for (i = 1; i < 500001; i++) {
//            n = d.calcSeq(i);
//
            k = i;
            n = 1;//1 for the last chain
            while(k != 1){
                n++;
                if(d.storage.containsKey(k)) {
                    n += d.storage.get(k);
                    break;
                }else if(k%2 == 0){
                    k /= 2;
                }else{
                    k = 3*k +1;
                }
            }
//            d.storage.put(i, n);
//            System.out.printf("i:%d has %d terms%n",i, max);
            if(n > max) {
                max = n;
//                maxi = i;
                System.out.printf("i:%d has %d terms%n",i, max);
            }
        }
//        System.out.println(d.storage.toString());
    }
    public int calcSeq(int i){
        int r;
        //If we already have the count of a number, return it
        if(storage.containsKey(i))
            return storage.get(i);
        //Get count for current index
        if(i == 1) {
            return 1;
        }else if(i%2 == 0){
            r = calcSeq(i/2) + 1;
        }else{
            r = calcSeq((3 * i) + 1) + 1;
        }
        //Once we have it, store it
        storage.put(i, r);

        return r;
    }

}
