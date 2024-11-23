package Pattern_Questions;
public class question3 {
    /*
  To Print below pattern
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
  16 17 18 19 20 21
 */

 public static void main(String args[])
{
    int rows = 5;
    int j = 1;
    for(int i = 1 ; i<rows ; i++)
    {
        for(int y = 1 ; y <= i ; y++)
        {System.out.print(j + " ");
        j++;
        }
        System.out.println();
    }
    
}    
}
