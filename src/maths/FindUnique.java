package maths;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,1,3,7,9};
        System.out.println(ans(arr));
    }

    static  int ans(int[] arr){
        int unique = 0;


        for(int i:arr){
            unique ^= i;
        }


        return unique;
    }
}
