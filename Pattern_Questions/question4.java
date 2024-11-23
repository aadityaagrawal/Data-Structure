package Pattern_Questions;
public class question4 {
    /*
     * To Print below pattern
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */

    public static void main(String args[]) {
        int rows = 9;

        
        for (int i =1; i < rows; i++) {
            if(i == 1)
            {
                System.out.println(1);
            }
            else {
            for (int y = 1; y <= i; y++) {
                if ((i + y) % 2 == 0) {
                    System.out.print(1 + " ");
                } else
                    System.out.print(0 + " ");
            }
            System.out.println();}
        }
        
    }

}
