package Leetcode74;

class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7},
                                     {10, 11, 16, 20},
                                     {23, 30, 34, 60}};
        int target = 7;
        boolean ans = Solution.searchMatrix(matrix, target);
        System.out.print(ans);
    }
}

class Solution {
    static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row: matrix) {
            int right = row.length - 1;
            if (row[right] < target) {
                continue;
            } else {
                int left = 0;
                while (left <= right) {
                    int middle = (left + right) / 2;
                    if (row[middle] == target) {
                        return true;
                    } else if (row[middle] < target) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                }
            }
        }
        return false;
    }
}