//21ce031 Dulari Bhushan
// Aim-The problem is to check whether a given Sudoku solution is correct.
package Practical1;

import java.util.Scanner;

public class Prac9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] d = new int[9][9];
        int temp = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp = temp ^ d[i][j];
            }
        }
        if (temp == 1)
            System.out.println("Yes It's possible");
        else
            System.out.println("No It isn't possible");

    }
}
