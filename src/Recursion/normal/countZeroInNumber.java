package Recursion.normal;

public class countZeroInNumber {
    public static void main(String[] args) {
       count(1000011,0);
    }

    static void count(int n, int c){
          if(n<10){
              System.out.println(c);
              return;
          }
          if(n%10==0){
              c++;
          }
          count(n/10,c);


    }
}
