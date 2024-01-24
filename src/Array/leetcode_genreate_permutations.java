package Array;

import java.util.ArrayList;
import java.util.List;

public class leetcode_genreate_permutations {


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();

        getPermutations(nums,new ArrayList<>(),result);
        RemoveDuplicate(result);

        System.out.println(result);
    }






    public static void getPermutations(int[] nums, List<Integer> current,List<List<Integer>> result){
         if(current.size()== nums.length){

                 result.add(new ArrayList<>(current));

             return;
         }

         for(int i:nums){
             if(!current.contains(i)){
                    current.add(i);
                    getPermutations(nums,current,result);
                    current.remove(current.size()-1);
             }
         }
    }

    static void RemoveDuplicate(List<List<Integer>> result){

        for(List<Integer> innerList : result){
        int index = result.indexOf(innerList);
            result.remove(innerList);
            if(!result.contains(innerList)){
                result.add(index,innerList);
            }

        }

    }
}
