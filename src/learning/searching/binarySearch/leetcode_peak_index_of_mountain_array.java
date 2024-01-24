package learning.searching.binarySearch;

public class leetcode_peak_index_of_mountain_array {
    public static void main(String[] args) {
         int[] arr = {3,4,5,1};

        System.out.println(peakIndexInMountainArray(arr));

    }

   static int peakIndexInMountainArray(int[] arr) {


       int start = 0,end = arr.length-1;
       while(start<end){
           int mid = start + (end - start) / 2;
           if(arr[mid]>arr[mid+1]){
               end = mid;
           }
           else {
               start = mid+1;
           }
       }
       return start;
    }
}
