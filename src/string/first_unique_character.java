package string;

public class first_unique_character {
    public static void main(String[] args) {
        String str = "ababaeacabded";
        System.out.println(solution(str));
    }
    public static char solution(String str){
        int[] arr = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            arr[ch-'a'] += 1;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(arr[ch-'a']==1){
                return ch;
            }
        }

        return 'a';

    }
}
