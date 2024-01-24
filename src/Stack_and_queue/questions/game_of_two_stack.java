package Stack_and_queue.questions;

import java.util.List;
import java.util.Stack;

public class game_of_two_stack {
    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 4, 6, 1);
        List<Integer> b = List.of(2, 1, 8, 5);
        int maxSum = 10;

        int result = twoStacks(maxSum, a, b);
        System.out.println(result);



    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            stackA.push(a.get(i));
        }

        for (int i = b.size() - 1; i >= 0; i--) {
            stackB.push(b.get(i));
        }

        return getCount(stackA, stackB, 0, 0, maxSum);

    }


    public static int getCount(Stack<Integer> a,Stack<Integer> b,int currentSum,int count,int maxSum){
         if(a.isEmpty() || b.isEmpty() || currentSum>maxSum){
             return count;
         }

         int leftVal = a.pop();
         int leftCount = getCount(a,b,currentSum+leftVal,count+1,maxSum);
         a.push(leftVal);
         int rightVal = b.pop();
         int rightCount = getCount(a,b,currentSum+rightVal,count+1,maxSum);
         b.push(rightVal);

         return Math.max(leftCount, rightCount);

    }
}
