package Array;

import java.util.ArrayList;

public class compress_the_video {
    public static void main(String[] args) {
        int[] video = {2,2,3,3,3,1,0,1,0,0,1};
        System.out.println(compress(video).toString());
    }
    public static ArrayList<Integer> compress(int[] video){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:video){
            list.add(i);
        }

        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)){
                list.remove(i);
                i--;
            }
        }

        return list;

    }
}
