/**
 *
 * Remove Element
 *
 *
 *
 * */
public class S8 {

    public static int removeElement(int[] nums,int target) {

        int index = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] != target) {
                nums[index++] = nums[i];
            }
        }

        return index;

    }

    public static void main(String[] args) {

        int[] nums = new int[]{3,2,2,3};

        System.out.println(removeElement(nums,3));

    }

}
