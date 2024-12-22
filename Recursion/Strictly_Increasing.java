public class Strictly_Increasing {
    public static void checkIncreasing(int[] input, int idx) {
        if (input.length - 1 == idx) {
            System.out.println("It's a strictly increasing series");
            return;
        }
        if(input[idx] < input[idx+1])
        {
            checkIncreasing(input, idx+1);
        }else
        {
            System.out.println("Not a strictly increasing series");
            return;
        }
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 4, 5, 6};

        checkIncreasing(input, 0);
    }
}
