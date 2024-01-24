package Recursion.array;

import java.util.ArrayList;

public class linearSearchWithMultipleOccurrences {
    public static void main(String[] args) {
        int[] arr= {1,24,5,6,2,5,6,35,5};
        int target = 5;
        ArrayList list = new ArrayList<>();

        list = search(arr,target,0,list);

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        System.out.println(list.toString());

    }

    static ArrayList search(int[] arr,int target , int index , ArrayList list){

        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }

        return search(arr,target,index+1,list);



    }
}
