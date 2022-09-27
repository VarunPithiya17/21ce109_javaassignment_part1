//BY 21CE109 VARUN PITHIYA
/*QUESTION :
Display numbers in a pyramid pattern.
                  1
                1 2 1
              1 2 4 2 1
            1 2 4 8 4 2 1
          1 2 4 8 16 8 4 2 1
        1 2 4 8 16 32 16 8 4 2 1
     1 2 4 8 16 32 64 32 16 8 4 2 1
  1 2 4 8 16 32 64 128 64 32 16 8 4 2 1  */

  import java.util.*;
  import java.lang.Math;
  
  class p1p7
  {
      public static void main(String[]args)
      {
          int lines=8;
          Scanner sc=new Scanner(System.in);
         
          System.out.print("Enter number of lines : ");
          lines=sc.nextInt();
         
          for(int i=0;i<lines;i++)
          {
              for(int s=i*2-lines;s<lines;s++)
              {
                  System.out.print(" ");
              }
  
              for(int j=0;j<=i;j++)
              {
                  System.out.print(""+(int)Math.pow(2,j)+" ");            
              }
              for(int k=i-1;k>=0;k--)
              {
                  System.out.print(""+(int)Math.pow(2,k)+" ");
              }
             
              for(int s=i;s<lines;s++)
              {
                  System.out.print(" ");
              }
              System.out.print("\n");
          }
      }
  }
  