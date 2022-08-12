package Arrays;


//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Time Complexity = O(n)
//Space Complexity = O(1)
public class BestBuyStock {

    public int maxProfit(int[]prices){


        //keep track of the best buy day so far
        //keep track of the largest difference so far

        int min_vaL = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i=0;i<prices.length;i++){
            if (prices[i]<min_vaL){
                min_vaL=prices[i];
            }
            else if(prices[i]-min_vaL>max_profit){
                max_profit = prices[i]-min_vaL;
            }
        }
        return max_profit;
    }
}
