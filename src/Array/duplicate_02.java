package Array;

import java.util.HashSet;
import java.util.Scanner;

public class duplicate_02 {

    public static boolean IsDuplicate(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        boolean isDuplicate;
        for (int i :arr){
            isDuplicate = hs.add(i);

            if(isDuplicate){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:-");

        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }

   boolean IsDuplicate = IsDuplicate(array);

        if(IsDuplicate){
            System.out.println("Array is duplicate");
        }
        else {
            System.out.println("not duplicate");
        }

    }
}
