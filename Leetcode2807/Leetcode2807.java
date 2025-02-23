package Leetcode2807;

public class Leetcode2807 {
    public static void main(String[] args) {
        // definition linked list
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int[] tests = {18, 6, 10, 3};
        for (int test: tests) {
            ListNode cur = new ListNode(test);
            prev.next = cur;
            prev = prev.next;
        }

        // run solution
        ListNode ans = Solution.insertGreatestCommonDivisors(head.next);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            int gcd = GCD(cur.val, cur.next.val);
            ListNode insert = new ListNode(gcd);
            insert.next = cur.next;
            cur.next = insert;
            cur = cur.next.next;
        }
        return head;
    }

    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a%b);
        }
    }
}