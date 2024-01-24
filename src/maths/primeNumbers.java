package maths;

public class primeNumbers {
    public static void main(String[] args) {
        int n=40;
//        for(int i=2;i<=n;i++){
//            System.out.println(i+" is prime "+ isPrime1(i));
//        }

        boolean[] arr = new boolean[n+1];

        seive(n,arr);


    }

    static void seive(int n, boolean[] arr){
        if(n<=1){
            return;
        }
        for(int i=2;i*i <=n ;i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j=j+i)
                {
                    arr[j] = true;
                }
            }

        }
        for (int i=2;i<=n;i++){
            System.out.println(i +" is prime:- "+ !arr[i]);
        }
    }
    static boolean isPrime1(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
