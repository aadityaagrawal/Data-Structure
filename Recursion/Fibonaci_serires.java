import java.util.Scanner;

public class Fibonaci_serires {

    static int Fibonachi(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        return Fibonachi(n - 1) + Fibonachi(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nThNumber = Fibonachi(n);
        System.out.println(nThNumber);
    }
}
