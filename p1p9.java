//BY 21CE109 VARUN PITHIYA
/*QUESTION :
The problem is to check whether a given Sudoku solution is correct. */

class p1p9
{
    public static void main(String[]args)
    {
        int[][] SudokuAnswer=new int[][] { {5,3,4,6,7,8,9,1,2},
                                           {6,7,2,1,9,5,3,4,8},
                                           {1,9,8,3,4,2,5,6,7},
                                           {8,5,9,7,6,1,4,2,3},
                                           {4,2,6,8,5,3,7,9,1},
                                           {7,1,3,9,2,4,8,5,6},
                                           {9,6,1,5,3,7,2,8,4},
                                           {2,8,7,4,1,9,6,3,5},
                                           {3,4,5,2,8,6,1,7,9} };
       
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(" "+SudokuAnswer[i][j]);

                if((j+1)%3==0)
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
            if((i+1)%3==0)
            {
                System.out.print("\n");
            }
        }

        //First Checking all the rows are correct or not by adding all the elements of a row, the sum of elements of all the rows should be 45 as 9+8+..+1=45
        int[] RowCheck=new int[]{0,0,0,0,0,0,0,0,0};

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                RowCheck[i]=SudokuAnswer[i][j]+RowCheck[i];
            }
            //System.out.println(RowCheck[i]);
        }

        //Now Checking all the columns are correct or not by adding all the elements of a columns, the sum of elements of all the rows should be 45 as 9+8+..+1=45
        int[] ColumnCheck=new int[]{0,0,0,0,0,0,0,0,0};

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                ColumnCheck[i]=SudokuAnswer[j][i]+ColumnCheck[i];
            }
            //System.out.println(ColumnCheck[i]);
        }

        //Now if rows and columns all are equal to 45 then sudoku is right
        for(int i=0;i<9;i++)
        {
            if(RowCheck[i]!=45 || ColumnCheck[i]!=45)
            {
                System.out.print("Sudoku is wrong");
                break;
            }
            else if((i+1)==9)
            {
                System.out.print("Sudoku is right");
            }  
        }
    }
}
