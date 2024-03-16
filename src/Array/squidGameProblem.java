package Array;

public class squidGameProblem {
    public static void main(String[] args) {
        int[] prize = {2,1,5};
        System.out.println(solution(prize,1));
    }
    public static int solution(int[] prizeMoney,int winnerIndex){
        int sum = 0;
        for(int i=0;i<prizeMoney.length;i++){
            if(i==winnerIndex){
                continue;
            }
            sum+=prizeMoney[i];
        }
        return sum;
    }
}
