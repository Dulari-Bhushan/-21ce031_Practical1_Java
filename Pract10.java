/* 21ce031 Dulari Bhushan
Aim- Implement Caesar Cipher.*/
package Practical1;

import java.util.Scanner;

public class Pract10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int length = string.length();

        char[] sh = string.toCharArray();

        System.out.print("Enter digits to be shifted");
        int pos = sc.nextInt();
        for (int i = 0; i < length; i++) {

            sh[i] = (char) (sh[i] + (pos));

        }
        System.out.println("The cipher code respectively after shifting:");
        for (int i = 0; i < length; i++) {

            System.out.print(sh[i]);
        }

    }
}
