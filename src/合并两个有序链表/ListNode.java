package �ϲ�������������;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /**
     * ͷ�巨���뵥����
     */
    public void addHead(int data) {
        ListNode node = new ListNode(data);
        node.next = this.next;
        this.next = node;
    }

    /**
     * β�巨���뵥����
     */
    public void addTail(int data) {
        ListNode node = new ListNode(data);
        ListNode head = this;
        while (head.next != null)
            head = head.next;
        head.next = node;
    }

}
