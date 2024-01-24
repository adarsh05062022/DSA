package Recursion.normal;

public class Main {
    public static void main(String[] args) {

        message(5);
    }

    static void message(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        message(n-1);
    }
}
