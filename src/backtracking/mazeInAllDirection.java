package backtracking;

import java.util.Arrays;

public class mazeInAllDirection {
    public static void main(String[] args) {
        boolean[][] cond =  {
                {true,true,true}
                ,{true,true,true}
                ,{true,true,true}
        };
        int[][] path =  new int[cond.length][cond[0].length];
//        allPaths("",0,0,cond);

        allPathsPrint("",0,0,cond,path,0);

    }
    static void allPaths(String p,int r,int c,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);

            return ;
        }

        if(!maze[r][c]){
            return;
        }
//        i am considering this block in my path

        maze[r][c]=false;

        if(r<maze.length-1){
            allPaths(p+"D",r+1,c,maze);
        }
        if(c<maze[0].length-1){
            allPaths(p+"R",r,c+1,maze);
        }
        if(r>0){
            allPaths(p+"U",r-1,c,maze);
        }
        if(c>0){
            allPaths(p+"L",r,c-1,maze);
        }



//        this line is where the func will over
//        before get removed , also remove the changes that were made by the function

         maze[r][c]=true;

    }


    static void allPathsPrint(String p,int r,int c,boolean[][] maze,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            System.out.println(p);
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();

            return ;
        }

        if(!maze[r][c]){
            return;
        }
//        i am considering this block in my path

        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1){
            allPathsPrint(p+"D",r+1,c,maze,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint(p+"R",r,c+1,maze,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+"U",r-1,c,maze,path,step+1);
        }
        if(c>0){
            allPathsPrint(p+"L",r,c-1,maze,path,step+1);
        }



//        this line is where the func will over
//        before get removed , also remove the changes that were made by the function

        maze[r][c]=true;
        path[r][c]=0;

    }
}
