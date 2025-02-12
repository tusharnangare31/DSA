package A14_Arrays_Parts2;

public class B6_Best_Time_To_Buy_and_Sell_Stock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};

    }
    public static int buyAndSellStock(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {// Profit
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;//todays Profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else {
                buyPrice = prices[i];
            }

        }
        return maxProfit;
    }


}
