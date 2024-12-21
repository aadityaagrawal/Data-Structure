import java.util.Scanner;

public class First_And_Last_Occurence {
    public static int first = -1;
    public static int last = -1;

    static void printfirstAndLast(String a, int idx, char check) {
        if (a.charAt(idx) == check) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }

        if (a.length() - 1 == idx) {
            if (last == -1)
                last = first;

            System.out.printf("The first occurrence of %s is at %d and last is at %d", check, first+1, last+1);

            return;
        }
        printfirstAndLast(a, idx + 1, check);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String(sc.nextLine());
        char check = 'a';
        printfirstAndLast(a, 0, check);

    }

}
