package round1.arraystring;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 design an algorithm to find the maximum profit.

 Example 1:
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 Input: [7, 6, 4, 3, 1]
 Output: 0

 In this case, no transaction is done, i.e. max profit = 0.


 * Created by xingfeiy on 7/1/16.
 */
public class BuyStock121 {
    public int maxProfitV2(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }

        int lowestPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }
        return maxProfit;
    }

    /**
     * Start Time: 4:10PM
     * End Time: 4:16PM.Failed, Time out.
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices == null) {
            return 0;
        }

        int maxProfit = 0;
        for(int i = prices.length - 1; i > 0; i--) {
            for(int j = i - 1; j >=0; j--) {
                if(prices[i] - prices[j] > maxProfit) {
                    maxProfit = prices[i] - prices[j];
                }
            }
        }
        return maxProfit;
    }


}
