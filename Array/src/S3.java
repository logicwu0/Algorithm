import java.util.HashSet;

/**
 *Longest Consecutive Sequence
 * For example, Given [100, 4, 200, 1, 3, 2] ,
 * The longest consecutive elements sequence is [1, 2,3, 4] .
 * Return its length: 4.
 *
 * Your algorithm should run in O(n) complexity
 * */

//如果使用排序 复杂度为O(nlogn),因为要求复杂度为O(n),所以使用hash表
//用一个哈希表存储所有出现过的元素，对每个元素，以该元素为中心，往左右扩张，直到不连续为止，记录下最长的长度
public class S3 {

    public static int longestConsecutive(int[] nums) {
        final HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
            set.add(i);
        }
        int longest = 0;
        for(int i : nums) {
            int length = 1;
            for(int j = i - 1;set.contains(j);--j) {
                set.remove(j);
                ++length;
            }
            for(int j = i + 1;set.contains(j);++j) {
                set.remove(j);
                ++length;
            }
            longest = Math.max(longest,length);
        }
        return longest;
    }



    public static void main(String[] args) {
            int[] nums = new int[]{100,4,200,1,3,2};
            System.out.print(longestConsecutive(nums));
    }
}
