package Array;

public class leetcode_buy_and_sellStocks {
    public static void main(String[] args) {
        int[] arr = {280,826,705,84,65,169,593,482,341,998,329,5,487,180,821,612,275,729,938,177,325,965,128,568,370,822,0,998,427,491,537,870,335,969,810,256,850,54,493,605,725,827,808,130,515,866,577,208,913,851,902,669,499,625,231,260,607,694,145,104,300,505,285,718,698,661,265,339,341,863,874,286,865,230,358,33,921,615,741,880,745,211,820,439,705,638,790,7,164,930,798,701,60,68,316,483,450,468,230,895,12,704,499,743,962,995,647,267,229,569,154,207,313,841,514,864,720,718,831,683,292,666,586,133,865,764,61,232,907,151,17,349};
        System.out.println(maxProfit(arr));
    }

        static int maxProfit(int[] prices) {



            int minPrice = prices[0];
            int maxProfit=0;

            for(int i=0;i<prices.length;i++){
                if(prices[i]<minPrice){
                    minPrice = prices[i];

                }
                else{
                    int currentProfit = prices[i]-minPrice;
                    maxProfit = Math.max(maxProfit,currentProfit);
                }
            }

            return maxProfit;

        }

}
