package learning.searching.binarySearch;

public class leetcode_minimum_in_mountain_array {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1,8};
    int target = 8;
    int peakElement = peakElementIndex(arr);

    int minimumIndex = binotanicalSearch(arr,target,0,peakElement,true);

    if(minimumIndex == -1){
         minimumIndex = binotanicalSearch(arr,target,peakElement+1,arr.length-1,true);

    }
        System.out.println(minimumIndex);
    }


    static int  peakElementIndex(int[] arr){
        int start=0,end = arr.length-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }

        return start;
    }

    static int binotanicalSearch(int[] arr,int target ,int start,int end,boolean isAscending){


        while (start<=end){
            int mid = start + (end-start)/2;
            if (isAscending){
                if (target>arr[mid]){
                    start = mid+1;
                } else if (target < arr[mid]) {
                    end = mid-1;
                }
                else {
                    return mid;
                }
            }
            else {
                if (target>arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
                else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
