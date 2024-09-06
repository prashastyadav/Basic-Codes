package basics;

import java.util.Scanner;

public class exponentialSeries {

    public static void main (String [] argh) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt ();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt ();
            int b = in.nextInt ();
            int n = in.nextInt ();
            int currVal = a;
            for (int j = 0; j < n; j++) {
                int exponentVal = (int) Math.pow (2, j);
                currVal = currVal + (exponentVal * b);
                System.out.printf ("%s ", currVal);
            }
        }
        in.close ();

    }

}
