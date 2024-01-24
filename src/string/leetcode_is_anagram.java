package string;

import java.util.Arrays;

public class leetcode_is_anagram {
    public static void main(String[] args) {
//        System.out.println(isAnagram("nagaram","anagram"));
        System.out.println(isAnagram2("nagaram","anagram"));



    }
    public static boolean isAnagram(String s, String t) {


        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagram2(String s, String t) {


       if(s==null||t==null|| s.length()!=t.length()){
           return false;
       }

       int[] count = new int[26];

       for(char c:s.toCharArray()){
           count[c-'a']++;
       }
        for(char c:t.toCharArray()){
            count[c-'a']--;
        }

        for(int c:count){
            if(c!=0){
                return false;
            }
        }



        return true;
    }
}
