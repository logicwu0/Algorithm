/**
 * Search a 2D Matrix
 * Integer in each row are sorted from left to right;
 * [
 *  [1,3,5,7],
 *  [10,11,16,20]
 *  [23,30,34,50]
 *  Given target = 3,return true
 * */
//二分查找
public class S5 {

    public static boolean searchMatrix(int[][] matrix,int target) {
        if(matrix.length ==0) {
            return false;
        }
        final int m = matrix.length;
        final int n = matrix[0].length;

        int first = 0;
        int last = m * n;

        while (first != last) {
            int mid = first + (last - first) / 2;
            int value = matrix[mid / n][mid % n];

            if (value == target) {
                return true;
            }
            if (value < target) {
                first = mid + 1;
            }
            else {
                last = mid;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 8;
        System.out.println(searchMatrix(matrix,target));

    }
}
