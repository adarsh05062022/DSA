package Array;

import java.util.Scanner;

public class Facebook_popular_post {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the posts");
        int posts = sc.nextInt();
        int[] likes = new int[posts];
        int[] comments = new int[posts];
        System.out.println("Enter the likes and comments on the posts");
        for(int i=0;i<posts;i++){
            System.out.println("for post "+ (i+1));
            likes[i] = sc.nextInt();
            comments[i] =sc.nextInt();
        }

        System.out.println(solution(likes,comments));
    }
    public static int solution(int[] likes,int[] comments){
        int popularPostIndex=0;
        if(likes.length<1){
            return -1;
        }

        for(int i=1;i<likes.length;i++){
            if(likes[i]>likes[popularPostIndex]){
                popularPostIndex = i;
            } else if (likes[i] == likes[popularPostIndex]) {
                if(comments[i]>comments[popularPostIndex]){
                    popularPostIndex = i;
                }
            }
        }
        return popularPostIndex+1;

    }
}
