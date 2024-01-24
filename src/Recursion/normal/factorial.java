package Recursion.normal;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(8));
    }

    static int fact(int n){
        if(n<2){
            return 1;
        }

        return n*fact(n-1);
    }
}
