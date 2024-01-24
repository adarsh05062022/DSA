package Array;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class remove_duplicate {

    public static void removeDuplicate(int[] arr){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(arr.length);
        for(int i:arr){
            hs.add(i);
        }

 Object[] newArr = hs.toArray();

        for(Object item:newArr){
            System.out.println(item);
        }

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

        removeDuplicate(array);

        sc.close();







    }
}
