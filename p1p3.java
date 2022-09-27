//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Given two non-negative int values, return true if they have the same last digit, such
as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true  */

import java.util.*;

class p1p3
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        num1=sc.nextInt();
        System.out.print("Enter number 2 : ");
        num2=sc.nextInt();

        boolean b=lastDigit(num1,num2);
        System.out.print(b);
    }

    public static boolean lastDigit(int num1,int num2)
    {
        //Logic
        if(num1%10 == num2%10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
