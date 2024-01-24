package cyclic_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class cyclicSortImplemetation {
    public static void main(String[] args) {
   int[] arr = {1,4,2,3,5};

        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr){

        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }


        return arr;
    }
    static void swap(int[] arr,int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to]=temp;
    }



}
