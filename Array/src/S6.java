import java.util.Arrays;

/**
 * 3Sum Closet
 * For example, given array S = {-1 2 1 -4} , and target = 1 .
 * The sum that is closest to the target is 2. ( -1 + 2 + 1 = 2 ).
 *
 */
//先排序  然后左右夹逼
public class S6 {

    public static int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int minGap = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                final int sum = nums[i] + nums[j] + nums[k];
                final int gap = Math.abs(sum - target);
                if (gap < minGap) {
                    result = sum;
                    minGap = gap;
                }
                if (sum < target) ++j;
                else --k;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));

    }
}
