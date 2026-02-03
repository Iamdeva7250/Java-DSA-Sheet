import java.util.*;
import java.io.*;

public class StockBuyandSell_MaxoneTransactionAllowed {
    
    // Your code here
     public int maxProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int res = 0;
        int maxprofit = prices[0];
        
        for(int i = 0; i< n; i++){
            maxprofit = Math.min(maxprofit, prices[i]);
            
            res = Math.max(res, prices[i] - maxprofit );
        }
        return res;
    }

    public static void main(String[] args) {
        StockBuyandSell_MaxoneTransactionAllowed solution = new StockBuyandSell_MaxoneTransactionAllowed();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit with one transaction allowed: " + maxProfit);        
    }
}