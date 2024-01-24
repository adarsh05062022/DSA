package learning.searching.binarySearch;

public class leetcode_smallest_letter_greater_than_target {
    public static void main(String[] args) {

        char[] arr = {'a','e','f','k','m'};
        char target = 'a';

        System.out.println(nextGreaterLetter(arr,target));

    }

    static char nextGreaterLetter(char[] letters,char target){
        int start = 0,end = letters.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(target<letters[mid]){
                end = mid-1;
            } else  {
                start = mid+1;
            }

        }


        return letters[start % letters.length];
    }
}
