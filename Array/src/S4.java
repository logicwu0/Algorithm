import java.util.Arrays;
import java.util.HashMap;

/**
 *Two Sum
 *Input: numbers={2, 7, 11, 15}, target=9
 *Output: index1=1, index2=2
 *
 * */

public class S4 {

    public static int[] twoSum(int[] nums,int target) {
        final HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for(int i = 0;i < nums.length;i++) {
            final Integer v = map.get(target-nums[i]);
            if (v != null && v > i) {
                return new int[]{i+1, v+1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }
}
