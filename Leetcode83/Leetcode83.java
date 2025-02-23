package Leetcode83;

public class Leetcode83 {
    public static void main(String[] args) {
        // definition linked list
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int[] tests = {1, 1, 2};
        for (int test: tests) {
            ListNode cur = new ListNode(test);
            prev.next = cur;
            prev = prev.next;
        }

        // run solution
        ListNode ans = Solution.deleteDuplicates(head.next);
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
    static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        
        return head;
    }
}