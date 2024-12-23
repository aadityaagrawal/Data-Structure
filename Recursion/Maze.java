public class Maze {
    public static int count = 0;
    public static void countPath(int n, int m, int i, int j)
    {
        if(i > n || j > m)
        {
            return;
        }
        else if (i == n && j == m)
        {
            count++;
            return;
        }

        countPath(n, m, i+1, j);
        countPath(n, m, i, j+1);


    }
    public static void main(String[] args) {
        int n = 2, m=2;

        countPath(n, m, 0, 0);

        System.out.println("The number of ways to reach at n and m is " + count );

    }


}
