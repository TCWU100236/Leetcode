package Leetcode875;
import java.util.*;

class Leetcode875 {
    public static void main(String[] args) {
        int[] piles = new int[]{30, 11, 23, 4, 20};
        int h = 5;
        int res = Solution.minEatingSpeed(piles, h);
        System.out.println(res);
    }
}


class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().orElse(1); // maximum pile

        while (left < right) {
            int mid = (left + right) / 2;

            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Equivalent to ceil(pile / k)
        }
        return hours <= h;
    }
}
