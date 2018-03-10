import java.util.Arrays;

/**
 * Search for a Range
 * For example,Given [5,7,7,8,8,10] and target value 8,return [3,4]
 * not found in the array return [-1,-1]
 *
 * lower_bound算法返回第一个大于等于给定值所在的位置
 * upper_bound算法返回第一个大于给定值所在的位置
 *
 * */
//已经排好序的  用二分查找法
public class S1 {

    public static int[] searchRange(int[] nums, int target) {
        int lower = lower_bound(nums, 0, nums.length, target);
        int upper = upper_bound(nums, 0, nums.length, target);

        if (lower == nums.length || nums[lower] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{lower, upper - 1};
        }
    }
        static int lower_bound(int[] A, int first,int last,int target){
            while (first != last) {
                int mid = first + (last - first) / 2;
                if (target > A[mid]) {
                    first = ++mid;
                } else {
                    last = mid;
                }
            }
            return first;
        }
        static int upper_bound ( int[] A, int first, int last, int target){
            while (first != last) {
                int mid = first + (last - first) / 2;
                if (target >= A[mid]) {
                    first = ++mid;
                } else {
                    last = mid;
                }
            }
            return first;
        }
    public static void main(String[] args) {

        int[] nums = new int[]{5,7,7,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
}
