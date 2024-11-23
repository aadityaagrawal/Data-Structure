package Pattern_Questions;
/*
  To Print below pattern
  *****
  *   *
  *   *
  *****
 */

public class question2 {
public static void main(String args[])
{
    int rows = 4, colums = 5;
    for(int i = 0 ; i<rows ; i++)
    {
        for(int j = 0 ; j<colums; j++)
        {
            if(i != 0 && i != (rows-1))
            {
                if(j == 0 || j == colums-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            else
            System.out.print("*");
        }
        System.out.println();
    }
}    
} 
