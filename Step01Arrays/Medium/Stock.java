package Step01Arrays.Medium;
import java.util.*;

class Solution {
    // Function to calculate maximum profit using single pass
    public int stockbuySell(int[] prices) {
      
        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        // Traverse each price in the array
        for (int price : prices) {
        
            if (price < minPrice) {
                minPrice = price;
            }
         
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}


class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(obj.stockbuySell(prices));
    }
}