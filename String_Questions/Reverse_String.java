package String_Questions;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input_string = new StringBuilder(sc.nextLine());
        sc.close();
        for(int i = input_string.length()-1; i>=0; i--)
        {
            System.out.print(input_string.charAt(i));
        }
    }
}
