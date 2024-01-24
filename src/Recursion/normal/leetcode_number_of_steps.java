package Recursion.normal;

public class leetcode_number_of_steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num) {
        int step = 0;
        if(num==0){
            return step;
        }

        if(num%2==0){
            step +=   numberOfSteps(num/2);
        }
        else{
            step +=   numberOfSteps(num-1);
        }

        return step+1;
    }
}
