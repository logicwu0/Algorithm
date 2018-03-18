/**
 *
 * Implement strStr()
 *判断一个字符串是否是另一个字符串的子串
 *
 * */
//暴力 复杂度O(M*N)
public class S2 {
    public static int strStr(final String haystack,final String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        final int N = haystack.length() - needle.length() + 1;
        for (int i = 0;i < N;i++) {
            int j = i;
            int k = 0;
            while (j < haystack.length() && k < needle.length() && haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            }
            if(k == needle.length()) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        final String s1 = "hello";
        final String s2 = "ll";
        System.out.println(strStr(s1,s2));
    }
}
