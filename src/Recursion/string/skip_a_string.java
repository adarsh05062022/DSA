package Recursion.string;

public class skip_a_string {
    public static void main(String[] args) {
        String str = "abaanmolbac";
        String target = "anm";
        System.out.println(skip(str,target));
    }


    static String skip(String up,String target){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(target)){
            return skip(up.substring(target.length()),target);
        }
        else {
            return up.charAt(0) + skip(up.substring(1),target);
        }
    }
}
