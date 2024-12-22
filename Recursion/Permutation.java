public class Permutation {

    public static void permutationString(String a, String newString)
    {
        if(a.length()==0)
        {
            System.out.println(newString);
            return;
        }

        for(int i = 0 ; i<a.length(); i++)
        {
            char first = a.charAt(i);
            String second = a.substring(0, i) + a.substring(i+1, a.length());

            permutationString(second, newString + first);
        }

    }

    public static void main(String[] args) {
        String a = "ABCD";
        permutationString(a,"");
    }
}