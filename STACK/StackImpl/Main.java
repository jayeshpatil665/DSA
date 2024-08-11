import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayStack myStack = new ArrayStack(5);
       
        System.out.println(myStack.isEmpty());
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.isEmpty());
    }
}