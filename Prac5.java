package Practical1;

import java.util.Scanner;

public class Prac5 {
    static int same(String s, String l) {
        char[] str1 = s.toCharArray();
        char[] str2 = l.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < l.length(); j++) {

                if (s.length() >= l.length()) {
                    if (i < l.length() - 1) {
                        if (str1[i] == str2[j] && str1[i + 1] == str2[j + 1]) {
                            ans++;
                        }
                    }
                } else {
                    if (j < s.length() - 1) {
                        if (str1[i] == str2[j] && str1[i + 1] == str2[j + 1]) {
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        int l = same(a, b);
        System.out.println(l);

    }
}
