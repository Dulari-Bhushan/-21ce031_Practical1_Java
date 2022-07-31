//21ce031_dulari
//Aim- Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target
/*string, make a new array of the correct length, and then copy over the correct 
strings.wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"] 
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]*/
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
