package Array;

import java.util.ArrayList;

public class find_peak_element {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        findPeaks(arr);
    }
    public static void findPeaks(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int leftMax=0,rightMAx=0;
            if(i>0 && arr[i]>arr[i-1]){
                leftMax = arr[i];
            }else if(i==0){
                leftMax = arr[i];
            }
            if(i+1<arr.length && arr[i]>arr[i+1]){
                rightMAx = arr[i];
            } else if (i==arr.length-1) {
                rightMAx = arr[i];
            }
            if(leftMax==rightMAx){
                list.add(leftMax);
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list.toString());
    }
}
