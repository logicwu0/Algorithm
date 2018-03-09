/**
 *Remove Duplicates from Sorted Array II
 *
 *For example, given sorted array A = [1,1,1,2,2,3] , your function should return length = 5 , and A is
 * now [1,1,2,2,3]
 *
 *
*/

public class S2 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2) {
            return nums.length;
        }
        int index = 2;
        for(int i = 2 ; i < nums.length; i++) {
            if(nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,2,2,3};
        System.out.print(removeDuplicates(nums));
    }
}
