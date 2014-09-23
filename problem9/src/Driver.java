/**
 * Created by Michael Manning on 9/4/2014.
 */
public class Driver {
    public static void main(String[] args) {
        int a;
        int b;
        double c;
        out:
        for(a = 0; a < 1000; a++) {
            for (b = 0; b < 1000; b++) {
                //If A is bigger than B then it can't be the answer
                if(a > b) {
                    continue;
                }
                //Calc C
                c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
                //If B is bigger than C then it can't be the answer
                if(b > c) {
                    continue;
                }
                //If the total sum isn't 1000 then it isn't the answer
                if ((a + b + c) != 1000) {
                    continue;
                }

                //This is the answer
                System.out.printf("A: %d B: %d C: %f%n",a,b,c);
                System.out.println(a*b*c);
//                break out;
            }
        }
    }
}
