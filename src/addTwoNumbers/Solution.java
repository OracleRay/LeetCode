package addTwoNumbers;

/**
 * 用C实现简单，Java.....
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre1 = l1;
        ListNode pre2 = l2;
        ListNode target = new ListNode();
        while (l1 != null || l2 != null){
            l1 = l1.next;
            l2 = l2.next;
            target.val = pre1.val + pre2.val;
            if (l1.val + l1.val >= 10) target.val++;
            target = target.next;
            pre1 = pre1.next;
            pre2 = pre2.next;
        }
        return target;
    }
}
