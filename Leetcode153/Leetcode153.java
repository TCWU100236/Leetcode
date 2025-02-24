package Leetcode153;

public class Leetcode153 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        int findMin = Solution.findMin(nums);
        System.out.println(findMin);
    }    
}

class Solution {
    static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] < nums[right]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return nums[right];
    }
}


