package learning.searching.binarySearch;

public class leetcode_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {6,7,1,2,3,4,5};
        int target = 6;


        int pivot = pivot(nums);
        System.out.println(pivot);
        int targetIndex = bianrySearch(nums,target,0,pivot);

        if(targetIndex==-1){
            targetIndex = bianrySearch(nums,target,pivot+1,nums.length-1);

        }
        System.out.println(targetIndex);


    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[mid]<=nums[start]){
                end = mid-1;
            }
            else {
                start= mid;
            }
        }
        return -1;
    }

    static int bianrySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = start +(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
