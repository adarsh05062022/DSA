package Recursion.normal;

public class fibonaaci {
    public static void main(String[] args) {
        System.out.println(nTHfibo(0));
    }

    static int nTHfibo(int num){
        if(num==1 || num==0){
            return 0;
        }
        if (num<2){
            return 1;
        }

        return nTHfibo(num-1)+nTHfibo(num-2);
    }
}
