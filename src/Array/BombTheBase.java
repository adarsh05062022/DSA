package Array;

public class BombTheBase {
    public static void main(String[] args) {

    }
    public static int solution(int bombStrength,int[] houses){
        int MaxHouseDestroyed = 0;
        for(int i=houses.length-1;i>=0;i++){
            if(houses[i]<bombStrength){
                return i+1;
            }
        }
        return 0;
    }
}
