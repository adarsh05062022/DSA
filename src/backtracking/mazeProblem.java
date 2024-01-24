package backtracking;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(path("",3,3));
//        System.out.println(path2("",3,3));
//        System.out.println(pathDiagonal("",3,3));

        boolean[][] cond =  {
                 {true,true,true}
                ,{false,true,false}
                ,{true,true,true}
        };
        pathwithobstacles("",0,0,cond);


    }

    static int count(int r,int c){
        if(r==1|| c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

    static String path(String p,int r,int c){
        if(r==1|| c==1){
            for(int i=1;i<r;i++){
                p += "D";
            }
            for(int i=1;i<c;i++){
                p += "R";
            }
            return p;
        }
        String left = path(p+"D",r-1,c);
        String right = path(p+"R",r,c-1);
        return left+" " + right+"  ";
    }

    static ArrayList<String> path2(String p, int r, int c){
        if(r==1|| c==1){
            for(int i=1;i<r;i++){
                p += "D";
            }
            for(int i=1;i<c;i++){
                p += "R";
            }

            ArrayList<String> list = new ArrayList<>();

            list.add(p);
            return list;
        }

        ArrayList<String> list = path2(p+"D",r-1,c);


        list.addAll(path2(p+"R",r,c-1));
        return list;
    }


    static ArrayList<String> pathDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1){
             list.addAll(pathDiagonal(p+"V",r-1,c));

        }
        if(r>1&&c>1){
            list.addAll(pathDiagonal(p+"D",r-1,c-1));

        }

        if(c>1){
            list.addAll(pathDiagonal(p+"H",r,c-1));

        }
        return list;
    }


    static void pathwithobstacles(String p,int r,int c,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathwithobstacles(p+"D",r+1,c,maze);
        }
        if(c<maze[0].length-1){
            pathwithobstacles(p+"R",r,c+1,maze);
        }


    }




}
