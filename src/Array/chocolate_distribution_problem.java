package Array;

import java.util.Arrays;
import java.util.Scanner;

public class chocolate_distribution_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of packet of the chocolate");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the chocolate in the packets:-");


        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the no of students");
        int s = sc.nextInt();

        Arrays.sort(array);

        for(int i=0,j=0;i<array.length ;i++){
            System.out.println("Minimum Difference is "+ (array[s-1]-array[0]));

        }
    }
}
