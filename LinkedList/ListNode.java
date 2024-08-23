public class ListNode {
    int data;
    ListNode next;

    ListNode() {
        data = 0;
        next = null;
    }

    ListNode(int data) {
        this.data = data;
        next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}