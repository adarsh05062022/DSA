package Recursion.normal;

public class reverseOfNumber {
    public static void main(String[] args) {
        int number = 121;
        int reversedNumber = rev(number);
        System.out.println(reversedNumber==number?"Palindrome":"not Palindrome");
    }

    static int rev(int n){
        if(n<10){
            return n;
        }

        int lastDigit = n%10;

        int remainingDigits = n/10;

        int reversed = rev(remainingDigits);

        return Integer.parseInt(String.valueOf(lastDigit) + String.valueOf(reversed));

    }

}
