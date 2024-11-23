package Pattern_Questions;
public class question5 {
    /*

        *     *
        **   **
        *** ***
        *******
        *******
        *** ***
        **   **
        *     *

     */
    public static void main(String[] args) {
        int rows = 4;
        int colums = rows*2;
        for(int i = 1 ; i<=rows; i++)
        {
            for(int j = 1 ; j<colums;j++)
            {
                if( (j>=1 && j<=i) || (j>= (colums-i)&&j<=colums))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = rows ; i>=1; i--)
        {
            for(int j = 1 ; j<colums;j++)
            {
                if( (j>=1 && j<=i) || (j>= (colums-i)&&j<=colums))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
