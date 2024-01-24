package Stack_and_queue;

import java.util.*;

public class inBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(10);
//        stack.push(45);
//        stack.push(50);
//        stack.push(11);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);


//        Queue<Integer> queue= new LinkedList<>();
//
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue);


        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(2);
        deque.addFirst(10);

        System.out.println(deque);




    }


}
