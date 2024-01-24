package Recursion.string;

public class printAscii {
    public static void main(String[] args) {
        getAscii("","abc");
    }

    static void getAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        getAscii(p+ch,up.substring(1));
        getAscii(p,up.substring(1));
        getAscii(p+(ch+0),up.substring(1));
    }
}
