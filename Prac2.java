package Practical1;

import java.util.Scanner;

public class Prac2 {
    static String verify(String s) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = new char[2];
        int i = 0;
        if (arr1[0] == 'o') {
            arr2[i] = arr1[0];
            i++;
        }
        if (arr1[1] == 'z') {
            arr2[i] = arr1[1];
        }

        String str = String.valueOf(arr2);
        return str;
    }

    public static void main(String[] args) {

        String h;
        Scanner sc = new Scanner(System.in);
        h = sc.next();

        System.out.print(verify(h));

    }
}
