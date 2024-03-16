package Array;

public class sumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(arr));
    }

    public static int sum(int[][] arr){
        int left = 0;
        int right = arr.length-1;
        int sum=0;

        while(left< arr.length && right>=0){
            if(left==right){
                sum += arr[left][left];
            }
            else{
                sum += arr[left][left] + arr[right][right];
            }
            left++;
            right--;
        }

        return sum;


    }
}
