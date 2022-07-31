// 21CE031 Dulari Bhushan
//Aim-The problem is to write a program that will grade multiple-choice tests. Assume there are
//eight students and ten questions, and the answers are stored in a two-dimensional array. Each
//row records a student’s answers to the questions, as shown in the following array.
//Key to the Questions:0 1 2 3 4 5 6 7 8 9
//Key D B D C C D A E A D
//DYour program grades the test and displays the result. It compares each student’s answers 
//with the key, counts the number of correct answers, and displays it.
package Practical1;

public class Prac8 {
    public static void main(String[] args) {
        String[] Answers = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
        String[][] stu = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
                { "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
                { "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
                { "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };
        int temp = 0;
        int l = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (Answers[i] == stu[j][i]) {
                    temp++;
                }
            }

            System.out.print("Student" + l + ":");
            l = l + 1;
            System.out.println(temp);
            temp = 0;
        }

    }
}
