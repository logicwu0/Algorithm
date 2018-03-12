/**
 * Find Minimun in Rotated Sorted Array 2
 *
 * Duplicates are allowed;
 *
 */
public class S8 {

    private static int findMin(int[] nums) {

        int first = 0;
        int last = nums.length - 1;
        int mid = first + (last - first) / 2;
        while (first > last) {
            if(nums[mid] < nums[last]) {
                last = mid;
            }
            else if (nums[mid] > nums[last]){
                first = mid +1;
            }
            else {
                --last;
            }
        }
        return nums[first];

    }

    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,1,1,2};

        System.out.println(findMin(nums));
    }
}
