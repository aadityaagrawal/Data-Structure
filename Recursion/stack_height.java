// Print x^n 

import java.util.Scanner;

public class stack_height {

    static void calculate_height(int x, int y, int result)
    {
        
        if(y==0)
        {

            System.out.println(result);
            return;
        }

        if(x==0)
        {

            System.out.println("0");
            return;
        }

        result = result * x;
        
        calculate_height(x, y-1, result);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;
        calculate_height(x,y, result);
    }
}
