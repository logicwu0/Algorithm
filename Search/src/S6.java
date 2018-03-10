/**
 * Search a 2D Matrix 2
 * for example
 *[
 * [1,4,7,11,15],
 * [2,5,8,12,19],
 * [3,6,9,16,22],
 * [10,13,14,17,14],
 * [18,21,23,26,30]
 *]
 * Given target = 5,return true;
 * Given target = 20,return false
 * */
public class S6 {

    public static boolean searchMatrix(int[][] matrix,int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length-1;
        while (i < matrix.length && j >= 0) {
            final int x = matrix[i][j];
            if(target == x) {
                return true;
            }
            else if(x < target){
                i++;
            }
            else {
                --j;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},
                                    {18,21,23,26,30}};
        int target = 20;
        System.out.println(searchMatrix(matrix,target));
    }
}
