package learning.searching.binarySearch;

public class floor_of_number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 16;

        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr,int target){
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

        return  arr[end];
    }
}
