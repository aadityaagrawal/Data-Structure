// To calculate sum of n numbers using recursion

import java.util.Scanner;

public class Calculate_Sum{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Integer n = sc.nextInt();

    int sum  = 0;
    sum1(0,n,sum);

    

}

static public void sum1(int i, int n, int sum)
{
    
    if(i == n)
    {
        sum += n;
        System.out.println(sum);
        return;
    }

    sum += i;
    sum1(i+1, n, sum);
}
}