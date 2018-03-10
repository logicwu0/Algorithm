/**
 * Search in Rotated Sorted Array
 * {0,1,2,3,4,5,6,7} rotated {4,5,6,7,0,1,2}
 * return target index otherwise return -1
 *
 * */
//二分查找 时间复杂度O(logn)
public class S3 {

    private static int search(int[] nums,int target) {
        int first = 0;
        int last = nums.length;
        while (first != last) {
            final int mid = first + (last - first) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[first] <= nums[mid]) {
                if(nums[first] <= target && target < nums[mid]) {
                    last = mid;
                }
                else {
                    first = mid + 1;
                }
            }
            else {
                if(nums[mid] < target && target <= nums[last-1]) {
                    first = mid + 1;
                }
                else {
                    last = mid;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));

    }
}
