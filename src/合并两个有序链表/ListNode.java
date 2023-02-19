package 合并两个有序链表;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * 头插法插入单链表
     */
    public void addHead(int data) {
        ListNode node = new ListNode(data);
        node.next = this.next;
        this.next = node;
    }

    /**
     * 尾插法插入单链表
     */
    public void addTail(int data) {
        ListNode node = new ListNode(data);
        ListNode head = this;
        while (head.next != null)
            head = head.next;
        head.next = node;
    }

}
