package string;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {

    }

    public static String getPrefix(String[] arr,String pre){
        if(arr.length<=1){
            return "";
        }
        for(int i=0;i<arr[0].length();i++){
            char pointer = arr[0].charAt(i);

            for(String str:arr){
                if(str.length()-1<i || str.charAt(i)!=pointer){
                    return pre;
                }

            }
            pre = pre+pointer;
        }


        return pre;

    }

    public static String optimised(String[] arr){
        String ans =  "";
        Arrays.sort(arr);

        String first = arr[0];
         String last = arr[arr.length-1];

         for(int i=0; i<Math.min(first.length(), last.length()); i++){
                 if(first.charAt(i)!=last.charAt(i)){

                     return ans;
             }
                 ans = ans+ first.charAt(i);
        }
         return ans;
    }
}
