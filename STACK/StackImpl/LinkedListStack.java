import java.util.EmptyStackException;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class LinkedListStack {
    Node top;
    int length;

    public LinkedListStack() {
        top = null;
        length = -1;
    }

    public void push(int x) {
       Node newNode = new Node(x);

       newNode.next = top;
       top = newNode;
       length++;
    }

    public int pop() {
      if(isEmpty()){
        System.out.println("Stack is underflow");
        return -1;
      }
      int data = top.data;
      top = top.next;
      length--;
      return data;
    }

    public int top() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (length<0);
    }

    public String toString(){
        String resulString="";

        Node currNode = top;

        while (currNode!=null) {
            resulString+=" "+currNode.toString()+"\n";
            currNode = currNode.next; 
        }

        return resulString;
    }
}
