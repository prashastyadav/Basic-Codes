package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given N as input the program prints table of N for first 10 multiples
 * 
 * @author Prashast
 */
public class TableOfN {

    public static void main (String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in));

        int N = Integer.parseInt (bufferedReader.readLine ()
            .trim ());

        int i = 1;

        while (i <= 10) {
            System.out.printf ("%d x %d = %d\n", N, i, N * i);
            i += 1;
        }
        ;

        bufferedReader.close ();
    }

}
