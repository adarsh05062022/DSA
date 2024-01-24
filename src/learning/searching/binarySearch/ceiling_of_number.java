package learning.searching.binarySearch;

public class ceiling_of_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 5;

        System.out.println(ceiling(arr,target));

        // ceiling means find the smallest number that is grater or equal to the target element
    }

    static int ceiling(int[] arr,int target){
         int start = 0,end = arr.length;
         int mid;

         while(start<=end){
             mid = (start+end)/2;
             if(target>arr[mid]){
                 start = mid+1;
             }
             else if(target<arr[mid]){
                 end=mid-1;
             }

             else{
                 return arr[mid];
             }
         }

        return  arr[start];
    }
}
