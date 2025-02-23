package Leetcode206;

public class Leetcode206 {
    public static void main(String[] args) {
        // definition linked list
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int[] tests = {1, 2, 3, 4, 5};
        for (int test: tests) {
            ListNode cur = new ListNode(test);
            prev.next = cur;
            prev = prev.next;
        }

        ListNode ans = Solution.reverseList(head.next);
        if (ans != null) {
            while (ans != null) {
                System.out.println(ans.val);
                ans = ans.next;
            }
        } else {
            System.out.println(ans);
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
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
