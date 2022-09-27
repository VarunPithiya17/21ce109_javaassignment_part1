//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Implement Caesar Cipher. */

import java.util.*;
import java.io.*;

class p1p10
{  
   
    public static void main(String []args)
    {
        String str=new String();
        int key;                          //Key will be 3 for Caeser CIpher
        Scanner sc=new Scanner(System.in);
        int choice;

        System.out.print("1.Encrpyt the text\n2.Decrypt the text\nEnter : ");
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.print("Enter the text : ");
            str=sc.next();
            System.out.print("Enter the key : ");
            key=sc.nextInt();
            char[] PlainText=str.toCharArray();  //Converting string to array to access each element of the string
            CaesarCipherEncrypt(PlainText,key);
        }
        else if(choice==2)
        {
            System.out.print("Enter the text : ");
            str=sc.next();
            System.out.print("Enter the key : ");
            key=sc.nextInt();
            char[] PlainText=str.toCharArray();  //Converting string to array to access each element of the string
            CaesarCipherDecrypt(PlainText,key);
        }
    }

    public static void CaesarCipherEncrypt(char[] PlainText,int key)
    {
        char[] CaesarCipherText=new char[PlainText.length];
        char replace;
        int index;
        String lower="abcdefghjiklmnopqrstuvwxyz";
        String upper="ABCDEFGHJIKLMNOPQRSTUVWXYZ";

        for(int i=0;i<PlainText.length;i++)
        {
            if(Character.isUpperCase(PlainText[i]))        //If character is upper case
            {
                index=upper.indexOf(PlainText[i]);         //Finding the position of our char wth indexOf
                replace=upper.charAt((key+index) %26);
                CaesarCipherText[i]=replace;
               
            }
            if(Character.isLowerCase(PlainText[i]))        //If character is lower case
            {
                index=lower.indexOf(PlainText[i]);        
                replace=lower.charAt((key+index) %26);
                CaesarCipherText[i]=replace;
       
            }
        }
        System.out.print("Caeser Text : ");
        for(int i=0;i<PlainText.length;i++)
        {
        System.out.print((CaesarCipherText[i]));
        }
    }

    public static void CaesarCipherDecrypt(char[] CaesarCipherText,int key)
    {
        char[] PlainText=new char[CaesarCipherText.length];
        char replace;
        int index;
        String lower="abcdefghjiklmnopqrstuvwxyz";
        String upper="ABCDEFGHJIKLMNOPQRSTUVWXYZ";

        for(int i=0;i<CaesarCipherText.length;i++)
        {
            if(Character.isUpperCase(CaesarCipherText[i]))        
            {
                index=upper.indexOf(CaesarCipherText[i]);        
                replace=upper.charAt((-key+index) %26);
                PlainText[i]=replace;
               
            }
            if(Character.isLowerCase(CaesarCipherText[i]))      
            {
                index=lower.indexOf(CaesarCipherText[i]);        
                replace=lower.charAt((-key+index) %26);
                PlainText[i]=replace;
       
            }
        }
        System.out.print("Caeser Text : ");
        for(int i=0;i<CaesarCipherText.length;i++)
        {
        System.out.print((PlainText[i]));
        }
    }
}
