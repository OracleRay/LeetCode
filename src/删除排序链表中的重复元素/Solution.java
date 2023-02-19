package ɾ�����������е��ظ�Ԫ��;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)      // ����[]
            return null;
        ListNode pre = head;
        ListNode p = head.next;
        while (p != null) {
            while (p.next != null && p.val == pre.val) {   // ֻҪǰ������Ԫ����ȣ�����������
                p = p.next;
            }
            if (p.next == null && p.val == pre.val) {   // ������󼸸�Ԫ����ȵ������
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
