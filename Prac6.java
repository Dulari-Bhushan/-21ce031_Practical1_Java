package Practical1;

import java.util.Scanner;

public class Prac6 {

    static String NString(String s, char a) {
        char[] str1 = s.toCharArray();
        char[] str2 = new char[s.length()];
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (str1[i] != a) {
                str2[temp] = str1[i];
                temp++;
            }
        }
        String str = String.valueOf(str2);
        return str;

    }

    public static void main(String[] args) {
        String d;
        char e;
        Scanner sc = new Scanner(System.in);
        d = sc.next();
        e = sc.next().charAt(0);
        System.out.println(NString(d, e));
    }
}
