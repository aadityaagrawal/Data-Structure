import java.util.Scanner;

public class Substring {

    public static void findSubstring(String input, int idx, String outpuString)
    {
        if(idx == input.length())
        {
            System.out.println(outpuString);
            return;
        }

        findSubstring(input, idx+1, outpuString);
        findSubstring(input, idx+1, outpuString + input.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpuString = sc.nextLine();

        findSubstring(inpuString, 0, "");
    }
}
