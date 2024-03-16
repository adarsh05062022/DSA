package Array;

import java.util.Scanner;

public class WA_Test_Cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the testCases");
        int testCasesSize = sc.nextInt();
        int[] testCaseValues = new int[testCasesSize];
        int[] testCasesStatus = new int[testCasesSize];
        System.out.println("Enter the value and status on the test case");
        for(int i=0;i<testCasesSize;i++){
            System.out.println("for testcase "+ (i+1));
            testCaseValues[i] = sc.nextInt();
            testCasesStatus[i] =sc.nextInt();
        }

        System.out.println(solution(testCaseValues,testCasesStatus));
    }
    public static int solution(int[] testCaseValues,int[] testCasesStatus){
        if(testCaseValues.length<1){
            return -1;
        }
        int minimumFailedTestCaseIndex =0;
        for(int i=0;i<testCaseValues.length;i++){
            if(testCasesStatus[i]==0){
                minimumFailedTestCaseIndex  = i;
                break;
            }
            if(i==testCaseValues.length-1){
                return -1;
            }
        }
        for(int i=minimumFailedTestCaseIndex+1;i<testCaseValues.length;i++){
            if(testCasesStatus[i]==0){
                if(testCaseValues[i]<testCaseValues[minimumFailedTestCaseIndex]){
                    minimumFailedTestCaseIndex = i;
                }
            }
        }
        return testCaseValues[minimumFailedTestCaseIndex];
    }
}
