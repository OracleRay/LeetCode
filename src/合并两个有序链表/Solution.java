package 合并两个有序链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode();
        ListNode pre = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        if (list1 != null)          // 处理还没有遍历结束的链表
            pre.next = list1;
        else if (list2 != null)
            pre.next = list2;
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        list1.addTail(1);
        list1.addTail(2);
        list1.addTail(4);
        list1.addTail(7);

        list2.addTail(1);
        list2.addTail(3);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(6);
        ListNode mergeList = new Solution().mergeTwoLists(list1, list2);
        ListNode p = mergeList;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
