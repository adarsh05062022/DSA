package Recursion.string;

import java.util.ArrayList;

public class leetcode_phone_number_problem {
    public static void main(String[] args) {
//        combinations("","12");

        System.out.println(combinations2("","12"));
    }

    static void combinations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
           return;
        }

        int digit = up.charAt(0)-'0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            combinations(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> combinations2(String p, String up){
        if(up.isEmpty()){
          ArrayList<String> list = new ArrayList<>();

          list.add(p);

            return list;
        }

        int digit = up.charAt(0)-'0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            list.addAll(combinations2(p+ch,up.substring(1)));
        }

        return list;
    }
}
