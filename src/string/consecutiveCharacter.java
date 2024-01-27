package string;

public class consecutiveCharacter {
    public static void main(String[] args) {
        System.out.println(getOutput("aabb",""));
    }

    public static String getOutput(String str,String curr)
    {
        if(str.isEmpty() ){
            return curr;
        }
        char checkingChar = str.charAt(0);

        if(curr.isEmpty() || curr.charAt(curr.length()-1)!=checkingChar){
            curr = getOutput(str.substring(1),curr+checkingChar);
        }
        else {
            curr = getOutput(str.substring(1),curr);

        }


        return curr;


    }
}
