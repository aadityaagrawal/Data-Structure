public class Reverse_string {

    static void reverseString(String a)
    {
        if(a.length() == 1)
        {
            System.out.print(a.charAt(0));
            return;
        }

        reverseString(a.substring(1,a.length()));
        System.out.print(a.charAt(0));
    }

    public static void main(String args[])
    {
        String a = "ABCD";
        reverseString(a);
        
    }
}
