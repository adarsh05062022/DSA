package Array;

import java.util.Scanner;

public class Race_400m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = 400;
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int tz = sc.nextInt();

        if(tx>ty){
            if(tx>tz){
                System.out.println("Alice");
            }
            else {
                System.out.println("Third");
            }
        }
        else {
            if(ty>tz){
                System.out.println("Bob");

            }
            else{
                System.out.println("Third");
            }
        }

    }

}
