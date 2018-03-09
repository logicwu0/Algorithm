import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *3Sum
 *For example, given array S = {-1 0 1 2 -1 -4}
 *A solution set is:
 * (-1, 0, 1)
 *(-1, -1, 2)
 * */
//先排序，然后左右夹逼，复杂度 O(n )。
//这个方法可以推广到 k-sum ，先排序，然后做 k-2 次循环，在最内层循环左右夹逼，时间复杂度是O(max{n log n, n })。
public class S5 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        final int target = 0;

        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < target) {
                    ++j;
                    while(nums[j] == nums[j-1] && j < k) ++j;
                } else if(nums[i] + nums[j] + nums[k] > target) {
                    --k;
                    while(nums[k] == nums[k+1] && j < k) --k;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    ++j;
                    --k;
                    while(nums[j] == nums[j-1] && j < k) ++j;
                    while(nums[k] == nums[k+1] && j < k) --k;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}
