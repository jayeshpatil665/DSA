public class DemoLL {
    
    public static void printLL(ListNode head){
        while (head.next!=null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static ListNode deleteHead(ListNode head) {
        if(head == null)
            return head;

        head = head.next;
        return head;    
    }

    public static ListNode deleteTail(ListNode head) {

        if(head == null || head.next == null)
            return null;

        ListNode bkpHead = head;
        while(head.next.next != null){
            head = head.next;
        }
        head.next = null;

        return bkpHead;
    }

    public ListNode deleteKthNode(ListNode head, int k) {

        if(head == null || k <= 0){
            return null;
        }
        if(k == 1){
            head = head.next;    
            return head;
        }

        ListNode bkpHead = head;
        int nodeMovement = 1;

        while(head != null && nodeMovement <k-1){
            head = head.next;
            nodeMovement++;
        }

        head.next = head.next.next;
        return bkpHead;
    }

    public ListNode insertAtHead(ListNode head, int X) {
        ListNode node = new ListNode(X);
        
        if(head == null)
            return node;

        node.next = head;
        head = node;
        return head;
    }

    public ListNode insertAtTail(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        if(head == null)
            return newNode;

        ListNode bkpHead = head;
        while(head.next !=null){
            head = head.next;
        }

        head.next = newNode;
        return bkpHead;
    }

    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head == null) //checking if LL is empty
            return head;
        
        if(head.data == X){ //checking if first element is X
            head = head.next;
            return head;
        }

        ListNode bkpHead = head;
        while(head.next != null){ //traversing till one node before X
            if(head.next.data == X)
                break;

            head = head.next;    
        }

        if(head.next!=null && head.next.data == X){ 
            if(head.next.next != null){ 
                head.next = head.next.next; //if X is midle node
            }
            else{
                head.next = null; //if X is last node
            }
        }

        return bkpHead;
    }

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        ListNode newNode = new ListNode(X);
        if(K==1 || head == null){
            newNode.next = head;
            return newNode;
        }

        ListNode bkpHead = head;
        int index = 1;
        while(head.next != null){
            if(index == K-1)
                break;

            head = head.next;
            index++;    
        }

        ListNode bkpHeadNext = head.next;

        head.next = newNode;
        newNode.next = bkpHeadNext;

        return bkpHead;
    }

    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head == null)
            return null;

        ListNode newNode = new ListNode(val);
        if(head.data == X){
            newNode.next = head;
            return newNode;
        }

        ListNode bkpHead = head;
        while(head.next != null){
            if(head.next.data == X){
                newNode.next = head.next;
                head.next = newNode;
                break;
            }

            head = head.next;
        }

        return bkpHead;    
    }
    
}
