package maths;

public class primeNumber {
    public static void main(String[] args) {
         int n = 37;
        System.out.println(isPrime2(n));

    }

    static boolean isPrime1(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2;i<n-1;i++){
            if(n%i==0){
              return false;
            }
        }
        return true;
    }
    static boolean isPrime2(int n){
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
