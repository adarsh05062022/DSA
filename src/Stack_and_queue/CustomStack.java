package Stack_and_queue;

public class CustomStack {
    protected int[] data;
    private int ptr = -1;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomStack(int size) {
        this.data =new int[size];
    }
    public boolean push(int item) throws StackException {
        if(isFull()){
            throw new StackException("Cannot pop from an empty stack");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int val = data[ptr];
//        ptr--;
//        return val;

        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }

    private boolean isFull(){
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }


    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.push(14);


    }
}
