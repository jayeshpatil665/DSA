class ArrayStack {

    private int top;
    private int capacity;
    private int stack[];

    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public ArrayStack(){
        this(1000);
    }

    public void push(int x) {
       if(top >=capacity -1){
        System.out.println("Stack overflow");
        return;
       }
       stack[++top] = x;
    }

    public int pop() {
      if(isEmpty()){
        System.out.println("Stack is underflow");
        return -1;
      }
      return stack[top--];
    }

    public int top() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return (top<0);
    }
}
