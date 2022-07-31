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
