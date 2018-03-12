/**
 * Find Minimun in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand;
 * example {0,1,2,4,5,6,7} might become {4,5,6,7,0,1,2}
 * Find the minimum element
 *
 * */
public class S7 {
    //1.顺序从左到右扫描，扫描到第一个逆序的位置，肯定是原始数据中第一个元素，时间复杂度为O(n);
    //2.二分查找：判断在左边还是右边

    private static int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int mid = first + (last - first) / 2;
        while (first > last) {
            if(nums[mid] < nums[last]) {
                last = mid;
            }
            else {
                first = mid +1;
            }
        }
        return nums[first];
    }


    public static void main(String[] args) {

        int[] nums = new int[]{4,5,6,7,1,2};

        System.out.println(findMin(nums));


    }
}
