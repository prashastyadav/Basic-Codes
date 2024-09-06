package basics;

import java.util.Scanner;

/**
 * Given input like java 100 xyz 63 www 89 output should be formatted as java
 * 100 xyz 063 www 089 %-15s: This format specifier tells Java to print the
 * string s1 left-justified in a field that is 15 characters wide. %03d: This
 * format specifier tells Java to print the integer x with exactly 3 digits,
 * padding with leading zeroes if necessary. %n: This format specifier adds a
 * newline after printing.
 * 
 * @author Prashast
 */
public class JavaOutputFormatting {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next ();
            int x = sc.nextInt ();
            System.out.printf ("%-15s%03d%n", s1, x);
        }
        System.out.println ("================================");
        sc.close ();
    }
}
