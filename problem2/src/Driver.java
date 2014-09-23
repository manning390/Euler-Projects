/**
 * Created by Michael Manning on 9/3/2014.
 */
public class Driver {
    public static void main(String[] args) {
        Driver d = new Driver();
        int i = 1;
        int result = 0;
        int sum = 0;
       while (result < 4000000){
           result = d.fib(i);
           if((result % 2) == 0){
               sum+=result;
           }
           i++;
       }
        System.out.println(""+sum);
    }
    public int fib(int a){
        if(a == 0 || a == 1)
            return 1;
        return fib(a-1)+fib(a-2);

    }
}
