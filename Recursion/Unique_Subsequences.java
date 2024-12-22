import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Unique_Subsequences {
    public static HashSet<String> output = new HashSet<String>();
    public static void uniqueSubsequences(String a, int idx, String required)
    {
        if(idx == a.length())
        {
            output.add(required);
            return;
        }
        uniqueSubsequences(a, idx+1, required);
        uniqueSubsequences(a, idx+1, required + a.charAt(idx));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        uniqueSubsequences(a, 0, "");
        
        Iterator itr = output.iterator();
 
       
        while (itr.hasNext()) {
            System.out.println((itr.next()));
        }

    }
}
