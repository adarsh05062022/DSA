package learning.searching.binarySearch;

public class leetcode_firstandlastpositionofsortedarray {
    public static void main(String[] args) {
   int[] arr = {1,2,4,4,4,4,5,7,7,7,8};
   int target = 4;

        System.out.println(searchRange(arr,target));
    }
    static int[] searchRange(int[] nums, int target) {


    int[] ans = {-1,-1};

    int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    // this function is return the index value of what we trying to find

   static int search(int[] nums,int target, boolean findStartIndex){

        int ans = -1;
        int start = 0,end = nums.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            }
            else {
                ans=mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start =mid +1;
                }
            }
        }
        return ans;
    }
}
