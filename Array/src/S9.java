
import java.util.Arrays;

/**
 *
 * Move Zeroes
 *
 * for example given nums = [0,1,0,3,12] nums should be [1,3,12,0,0]
 *
 * */
public class S9 {

    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for(int i = index;i < nums.length; ++i) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,3,12};

        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
}
