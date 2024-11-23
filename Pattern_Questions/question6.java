package Pattern_Questions;
public class question6 {
/*
         * * * * * 
      * * * * *   
    * * * * *     
  * * * * *       
* * * * *   
 */
    public static void main(String[] args) {
        int rows = 5;
        int colums = rows*2 - 1;
        for(int i = 1 ; i<=rows; i++)
        {
            for(int j=1; j<=colums; j++)
            {
                if(j<=rows-i || j>(colums-(i-1)))
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
