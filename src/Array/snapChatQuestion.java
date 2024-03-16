package Array;

public class snapChatQuestion {
    public static void main(String[] args) {
        int[] A = {0,1,2,0,1,2,4};
        int[] B = {1,0,2,3,0,1,3};

        System.out.println(solution(A,B));
    }
    public static int solution(int[] firstPerson,int[] secondPerson){
        int MAxDayCount = 0;
        int currentDayCount=0;
        for(int i = 0;i<Math.min(firstPerson.length,secondPerson.length);i++){
            if(firstPerson[i]!=0 && secondPerson[i]!=0){
                currentDayCount++;
            }
            else {
                currentDayCount=0;
            }
            MAxDayCount = Math.max(MAxDayCount,currentDayCount);
        }
        return MAxDayCount;
    }
}
