package Array;

import java.util.Scanner;

public class reverse_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the elements in the array:- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the array elements:-");
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }


        for(int i=0,j = n-1;i<j;i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j]=temp;
        }


        System.out.println("The reverse array is :-");
        for(int item:array){
            System.out.print(item+", ");
        }







    }
}
