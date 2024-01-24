package learning.searching;

public class leetcode_evenDigit {

    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};

        System.out.println(findNumber(array));
    }

    static int findNumber(int[] arr){
        int totalNumber = 0;
         for(int ele:arr){
            if(evenNumberOfDigit(ele)){
                totalNumber++;
            }
         }
         return totalNumber;
    }

    static boolean evenNumberOfDigit(int val){
        int numOfDigit = 0;
        while(val!=0){
            val = val/10;
            numOfDigit++;
        }

        return numOfDigit%2== 0;

    }
}
