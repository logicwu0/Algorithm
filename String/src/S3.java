import java.util.HashSet;

public class S3 {
    private static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int res = 0;
        HashSet set = new HashSet();
        for(int i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i))) {
                res = 0;
            }else {
                res++;
                max = Math.max(res,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
       String s = "pwwkew";
       System.out.println(lengthOfLongestSubstring(s));
    }
}
