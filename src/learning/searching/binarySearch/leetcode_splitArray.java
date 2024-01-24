package learning.searching.binarySearch;

public class leetcode_splitArray {
    public static void main(String[] args) {
    int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while (start<end){
            int mid = start+(end-start)/2;

            int sum=0;
            int pieces = 1;

            for(int ele : nums){
                if(sum+ele>mid){
                    sum = ele;
                    pieces +=1;
                }
                else{
                    sum += ele;
                }

            }
            System.out.println("pieces "+pieces);
            if(pieces<=k){
                end = mid;
                System.out.println("end "+end);

            }else {
                start = mid+1;
                System.out.println("start "+start);

            }

        }

        return start;
    }
}
