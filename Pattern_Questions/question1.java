package Pattern_Questions;
/*
  To Print below pattern
  *****
  *****
  *****
  *****
 */

 public class question1 {
 
    public static void main(String args[])
    {
        int rows = 4, colums = 5;
        for(int i = 0 ; i<rows ; i++)
        {
            for(int j = 0 ; j<colums; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 }