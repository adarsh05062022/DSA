package Array;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the elements in the array:- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the array elements:-");
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }

        boolean found = false;

        for(int i=0;i<array.length;i++){
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    found = true;
                    break;
                }
            }
            if(found){

                break;
            }

        }
        if(found){
            System.out.println("Duplicate in array found.");

        }
        else {
            System.out.println("Duplicate in array not found.");

        }
    }
}
