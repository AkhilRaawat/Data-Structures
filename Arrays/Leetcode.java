class Solution {
    public int maxProfit(int[] prices) {
    int maxprofit=0,currentprofit=0;
    int buyingprice=prices[0];
    for(int i=0;i<prices.length;i++){
        currentprofit=prices[i]-buyingprice;
        maxprofit=Math.max(currentprofit,maxprofit);
        buyingprice=Math.min(buyingprice,prices[i]);
    }
    return maxprofit;
    }
}