package Array;

import java.util.Scanner;

public class max_min_ele {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the elements in the array:- ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the array elements:-");
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }
        int min = 0,max=0;
        if(n>0){
             min = array[0];
             max=array[0];
            for(int i:array){
                if(i>max){
                    max = i;
                }
                if(i<min){
                    min=i;
                }
            }
        }



        System.out.println("Minimum Element is "+ min + "\nMaximum element is "+ max);



    }
}
