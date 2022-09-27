//BY 21CE109 VARUN PITHIYA
/*QUESTION :
The problem is to write a program that will grade multiple-choice tests. Assume
there are eight students and ten questions, and the answers are stored in a two dimensional array. Each row records a student’s answers to the questions, as
shown in the following array.
Students’ Answers to the Questions:
0 1 2 3 4 5 6 7 8 9
Student 0 A B A C C D E E A D
Student 1 D B A B C A E E A D
Student 2 E D D A C B E E A D
Student 3 C B A E D C E E A D
Student 4 A B D C C D E E A D
Student 5 B B E C C D E E A D
Student 6 B B A C C D E E A D
Student 7 E B E C C D E E A D
The key is stored in a one-dimensional array:
Key to the Questions:
0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
Your program grades the test and displays the result. It compares each student’s
answers with the key, counts the number of correct answers, and displays it. */

import java.util.*;
class p1p8
{
    public static void main(String[]args)
    {                                            
        char[][] StudentAnswers=new char[][]{   {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                                                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                                                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                                                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'} };

        char[] Key=new char[] {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] CorrectAnswers= new int[]{0,0,0,0,0,0,0,0};

        //Logic to fiind the number of correct answers
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(StudentAnswers[i][j]==Key[j])
                {
                    CorrectAnswers[i]++;
                }
            }
        }

        //Print the correct answers for each student
        for(int i=0;i<8;i++)
        {
            System.out.println("Student "+ (i+1) + " correct answers : " +CorrectAnswers[i]);
        }
   
    }
}
