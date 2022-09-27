//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Given 2 strings, a and b, return the number of the positions where they contain the
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0 */

import java.util.*;

class p1p5
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first string : ");
        s1=sc.next();
        System.out.print("Enter second string : ");
        s2=sc.next();

        int match=stringMatch(s1,s2);

        System.out.print("Matches : "+match);
    }

    public static int stringMatch(String s1,String s2)
    {
        int matches=0;

        if(s1.length()>s2.length())
        {
            for(int i=0;i<(s2.length()-1);i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    if(s1.charAt(i+1)==s2.charAt(i+1))
                    {
                        matches++;
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<(s1.length()-1);i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    if(s1.charAt(i+1)==s2.charAt(i+1))
                    {
                        matches++;
                    }
                }
            }
        }

        return matches;
    }
}
