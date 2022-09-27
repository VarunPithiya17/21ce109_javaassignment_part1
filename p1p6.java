//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Given an array of strings, return a new array without the strings that are equal to
the target string. One approach is to count the occurrences of the target string, make
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"] */

import java.util.*;

class p1p6
{
    public static void main(String[]args)
    {
        int lenght;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter lenght array of String : ");
        lenght=sc.nextInt();

        String[] str=new String[lenght];
        String targetstr;

        for(int i=0;i<lenght;i++)
        {
            System.out.print("Enter element "+ i + " : ");
            str[i]=sc.next();
        }

        System.out.print("Enter the target string : ");
        targetstr=sc.next();

        String[] newStr=wordsWithout(str,targetstr);

        System.out.print("\nString array without the target string : ");
        for(int i=0;i<newStr.length;i++)
        {
            System.out.print(newStr[i]);
        }
 
    }

    public static String[] wordsWithout(String[] str,String targetstr)
    {
        String[] newStr;
        newStr=new String[2];
        int j=0;

        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(targetstr))          //Using equals to compare the strings
            {}
            else
            {
                newStr[j]=str[i];
                j++;
            }
        }

        return newStr;
    }
}
