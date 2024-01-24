package learning.searching.binarySearch;

public class gfg_search_in_infinite_size_array {
    public static void main(String[] args) {
        int[] array = {10,11,25,33,62,76,86,97,122,234,345,456,567,890,908};
        int target = 456;

        System.out.println(array[search(array,target)]);

    }

    static int search(int[]arr,int target){
        int start = 0,end =0;

        while(start<=end){
            if(target>=arr[start] && target<=arr[end]){
              int  mid = (start+end)/2;

              if(target>arr[start]){
                  start = mid+1;
              } else if (target < arr[mid]) {
                  end = mid-1;
              }

              else {
                  return mid;
              }

            }
            else {
                start = end+1;
                end = start*2;
            }
        }

        return -1;
    }
}
