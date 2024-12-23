import java.util.ArrayList;
import java.util.List;

public class Permutation_Same_Length {
    public static List<List<Integer>> result_final = new ArrayList<>();
    public static void permutation(List<Integer> nums, List<Integer> result)
    {
        if(nums.size() == result.size())
        {
            result_final.add(new ArrayList<>(result));
            return;
        }

        for(int i = 0 ; i<nums.size(); i++)
        {
            if (!result.contains(nums.get(i))) {
            result.add(nums.get(i));
            permutation(nums, result);
            result.remove(result.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        List<Integer> result = new ArrayList<>();
        permutation(input, result);

        for(int i = 0; i<result_final.size(); i++)
        {
            System.out.println(result_final.get(i));
        }
    }
}
