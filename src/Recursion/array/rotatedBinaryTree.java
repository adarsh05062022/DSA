package Recursion.array;

public class rotatedBinaryTree {
    public static void main(String[] args) {

    }

    static int findPeak(int[] arr,int start,int end){
        if(arr.length==0){
            return -1;

        }
        int mid = start + (end-start)/2;
        if(arr[mid]<arr[mid+1]){
            start=mid;
        }
        else {
//            end
        }

        return 1;

    }
}
