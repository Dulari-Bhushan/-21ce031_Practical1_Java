/* 21ce031_dulari
Aim- Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, 
so 17 % 10 is 7.lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true*/
package Practical1;

import java.util.Scanner;

public class Prac3 {
    static boolean check(int s, int h) {
        int d, t;
        d = s % 10;
        t = h % 10;
        if (d == t)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        boolean c = check(a, b);
        System.out.print(c);

    }
}
