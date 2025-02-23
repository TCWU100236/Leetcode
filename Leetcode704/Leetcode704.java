package Leetcode704;

public class Leetcode704 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int ans = Solution.search(nums, target);
        System.out.println(ans);
    }
}

class Solution {
    static int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}