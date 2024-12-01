// To print number till n using recursion

import java.util.Scanner;

public class Printing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Integer i = sc.nextInt();

        printNumber(i);
    }

    static void printNumber(int i) {
        if (i == 1) {
            System.out.print(i + " ");
            return;
        } else {
            printNumber(i-1);
            System.out.print(i + " ");
        }
    }
}