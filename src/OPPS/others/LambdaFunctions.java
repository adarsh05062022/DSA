package OPPS.others;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
//        arr.forEach((item)->System.out.println(item*2));

        Operation sum = (a,b)-> a+b;
        Operation diff = (a,b)-> a-b;
        Operation multiply = (a,b)-> a*b;
        Operation divide = (a,b)-> a/b;

   LambdaFunctions fun = new LambdaFunctions();

        System.out.println(fun.operate(2,3,sum));
    }

    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

    interface Operation{
        int operation(int a, int b);
    }


}




