package Recursion.string;

public class skip_a_character {
    public static void main(String[] args) {
       String str = "abacba";

       char ch = 'b';
//        remove("",str,ch);
        System.out.println(remove1(str,ch));

    }
    static void remove(String p,String up,char target){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch==target){
            remove(p,up.substring(1),target);
        }
        else{
            remove(p+ch,up.substring(1),target);
        }

    }


    static String remove1(String up,char target){
        if(up.isEmpty()){

            return "";
        }
        char ch = up.charAt(0);
        if(ch==target){
          return  remove1(up.substring(1),target);
        }
        else{
           return ch+ remove1(up.substring(1),target);
        }

    }



}
