/**
 * Jump Game
 *
 * A = [2,3,1,1,4] return true
 * A = [3,2,1,0,4] return false
 *
 * */
public class S1 {

    public static boolean canJamp(int[] nums) {
        int reach = 1;
        for(int i = 0;i < reach && reach < nums.length; ++i) {
            reach = Math.max(reach,i + 1 + nums[i]);
        }
        return reach >= nums.length;
    }

    public static void main(String[] args) {

        int nums[] =new int[] {2,3,1,1,4};

        System.out.println(canJamp(nums));
    }
}
