//21ce031_dulari
//Aim- Display numbers in a pyramid pattern.
/*                1
               1 2 1
             1 2 4 2 1
           1 2 4 8 4 2 1
         1 2 4 8 16 8 4 2 1
      1 2 4 8 16 32 16 8 4 2 1
    1 2 4 8 16 32 64 32 16 8 4 2 1
 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 */
package Practical1;

import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {

        int a = 0;
        final String string = " ";
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.printf("%4s", string);
            }
            for (int c = 0; c <= i; c++) {
                a = (int) Math.pow(2, c);
                System.out.printf("%4d", a);
            }
            for (int c = i - 1; c >= 0; c--) {
                a = (int) Math.pow(2, c);
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
    }
}
