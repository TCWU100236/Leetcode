package Leetcode739;
import java.util.Stack;

class Leetcode739 {
    public static void main(String[] args) {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        for (int temp: Solution.dailyTemperatures(temperatures)) {
            System.out.println(temp);
        }
    }
}

class Solution {
    static int[] dailyTemperatures (int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<int[]> stack = new Stack<>();

        for (int i=0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] prev = stack.pop();
                ans[prev[1]] = i - prev[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return ans;
    }
}



