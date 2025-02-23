package Leetcode19;

class Leetcode19{
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
        
        // run solution
        ListNode ans = Solution.removeNthFromEnd(head, 2);
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

// Write your solution.
class Solution {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ahead = dummy;
        ListNode behind = dummy;
        for (int i=0; i <= n; i++) {
            ahead = ahead.next;
        }
        while (ahead != null) {
            ahead = ahead.next;
            behind = behind.next;
        }
        behind.next = behind.next.next;
        return dummy.next;
    }
}