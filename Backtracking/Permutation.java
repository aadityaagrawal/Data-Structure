package Backtracking;

public class Permutation {
    public static void permutation1(String input, String output)
    {
        while(input.length() == 0)
        {
            System.out.println(output);
            return;
        }
        for(int i = 0 ;i<input.length(); i++)
        {
            char a = input.charAt(i);
            String newString = input.substring(0, i) + input.substring(i+1);

            permutation1(newString, output+a);
        }
    }
    public static void main(String[] args) {
        String input = "ABCD";
        permutation1(input, "");
    }
}
