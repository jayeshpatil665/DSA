public class ArrayStack {
    protected int top;
    protected int capacity;
    protected int stack[];

    public ArrayStack(int size){
        this.capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) throws Exception{
        if(size()==capacity)
            throw new Exception("Stack is Overflow !");

        top++;    
        stack[top]=element;
    }

    public int pop() throws Exception{
        if(top==-1)
            throw new Exception("Stack is Underflow");

       int bkpElement = stack[top];
       top--;
       return bkpElement;
    }

    public int peek() throws Exception{
        if(top==-1)
            throw new Exception("Stack is empty");

        return stack[top];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top<0);
    }

}
