//21ce031_dulari
//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//array123([1, 1, 2, 3, 1]) → true   array123([1, 1, 2, 4, 1]) → false   array123([1, 1, 2, 1, 2, 3]) → true
package Practical1;

import java.util.Scanner;

public class Prac4 {
    static boolean check(int[] sh, int s) {
        int temp = 0;
        for (int i = 0; i < s; i++) {
            if (sh[i] == 1 && sh[i + 1] == 2 && sh[i + 2] == 3) {
                temp = 1;
                break;
            }

        }
        if (temp == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        boolean k = check(arr1, a);
        System.out.print(k);
    }
}
