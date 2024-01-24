package string;

import java.util.ArrayList;

public class validParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
    public static boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();


        for(char c : s.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                list.add(c);
                continue;
            }
            if( list.size()>0 && ((c=='}' && list.get(list.size()-1)=='{') || (c==')' && list.get(list.size()-1)=='(') || (c==']' && list.get(list.size()-1)=='[')) ) {
                list.remove(list.size()-1);
            }
            else {
                return false;
            }


        }


        return list.isEmpty();
    }
}
