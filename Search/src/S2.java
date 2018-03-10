/**
 *Search Insert Position
 *
 * For example
 * [1,3,5,6],5 -> 2
 * [1,3,5,6],2 -> 1
 * [1,3,5,6],7 -> 4
 * [1,3,5,6],0 -> 0
 * lower_bound算法返回第一个大于等于给定值所在的位置
 *
 * */
public class S2 {

    public static int searchInsert(int[] nums,int target) {
        return lower_bound(nums,0,nums.length,target);
    }
    static int lower_bound(int[] A,int first,int last,int target) {
        while (first != last) {
            int mid = first + (last-first) / 2;
            if (target > A[mid]) {
                first = ++mid;
            }
            else {
                last = mid;
            }
        }
        return first;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));

    }
}
