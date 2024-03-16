package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Passing_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the Students");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("Enter the marks of the students");
        for(int i=0;i<size;i++){
            System.out.println("for student "+ (i+1));
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the number of passed students:-");
        int noOfPassedStudents = sc.nextInt();

        System.out.println(solution(marks,noOfPassedStudents));
    }
    public static int solution(int[] marks,int passedStudents){
        Arrays.sort(marks);
        return marks[marks.length-passedStudents]-1;
    }
}
