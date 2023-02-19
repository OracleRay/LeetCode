package 删除排序链表中的重复元素;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)      // 处理[]
            return null;
        ListNode pre = head;
        ListNode p = head.next;
        while (p != null) {
            while (p.next != null && p.val == pre.val) {   // 只要前后两个元素相等，则向后遍历。
                p = p.next;
            }
            if (p.next == null && p.val == pre.val) {   // 处理最后几个元素相等的情况。
                pre.next = null;
                return head;
            }
            pre.next = p;
            pre = pre.next;
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
//        list.addTail(2);
//        list.addTail(2);
//        list.addTail(2);
//        list.addTail(2);
//        list.addTail(3);
        ListNode deleteList = new Solution().deleteDuplicates(list);
        ListNode p = deleteList;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
