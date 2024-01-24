package Stack_and_queue.questions;

import java.util.Stack;

public class Implement_Queue_using_Stacks_232 {




    public static void main(String[] args) {

    }



}


class MyQueue {

    private Stack<Integer> first;
    private  Stack<Integer> second;

    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();

    }

    public void push(int x) {
      first.push(x);
    }

    public int pop() {
        if(first.isEmpty()){
            return -1;
        }

       while(!first.isEmpty()){
           second.push(first.pop());
       }
      int poped =  second.pop();
       while(!second.isEmpty()){
           first.push(second.pop());
       }
       return poped;
    }

    public int peek() {
        if(first.isEmpty()){
            return -1;
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int val = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return val;
    }

    public boolean empty() {
        if(first.isEmpty()){
            return true;
        }
        return false;
    }
}
