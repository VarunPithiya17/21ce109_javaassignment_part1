//BY 21CE109 VARUN PITHIYA
/* QUESTION :
Given a string, return a string made of the first 2 chars (if present), however, include
Firs,t char only if it is 'o' and include the second only if it is 'z', soOzymandiasas"
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o" */

import java.util.Scanner;
class p1p2
{
    public static void main(String[]args)
    {
        String str;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string : ");
        str=sc.next();

        String OZString=startOZ(str);
        System.out.println("String with OZ : "+ OZString);
    }

//LOGIC FUNCTION
    public static String startOZ(String str)
    {
        if(str.charAt(0)=='o' || str.charAt(0)=='O')  //Using charAt method access the elements of the string
        {
            if(str.charAt(1)=='z' || str.charAt(1)=='Z')
            {
                return "oz";       //Returns oz if both present
            }
            else
            {
                return "o";       //Return only o
            }
        }
        else if(str.charAt(1)=='z' || str.charAt(1)=='Z')
        {
           return "z";           //Return only z
        }
        else
        {
            return "";
        }
    
    }
