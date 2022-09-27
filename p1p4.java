//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true */

import java.util.*;

class p1p4
{
    public static void main(String args[])
    {
        int lenght;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter lenght of the array : ");
        lenght=sc.nextInt();

        int[] arr=new int[lenght];  

        for(int i=0;i<lenght;i++)
        {
            System.out.print("Enter element "+i+" : ");
            arr[i]=sc.nextInt();
        }

        boolean b=array123(arr);

        System.out.print(b);
    }

    public static boolean array123(int[]arr)
    {
        int flag=0;
        for(int i=0;i<(arr.length-2);i++)
        {
            if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
            {
                return true;
            }
        }

        return false;
    }
}
