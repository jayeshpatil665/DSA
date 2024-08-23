
public class Main {

    public static void main(String[] args) {
        
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);

        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;

        DemoLL.printLL(nodeOne);
        System.out.println("\n");
        ListNode headNode = DemoLL.deleteHead(nodeOne);
        DemoLL.printLL(headNode);

        System.out.println("\n");
        headNode = DemoLL.deleteTail(nodeOne);
        DemoLL.printLL(headNode);
    }
    
}