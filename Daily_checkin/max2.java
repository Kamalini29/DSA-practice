public class max2 {
    
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        int[] dp = new int[budget + 1];

        int minPrice = Integer.MAX_VALUE;

        // Find the cheapest item
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
        }

        // 0/1 Knapsack
        for (int i = 0; i < n; i++) {

            int factor = items[i][0];
            int price = items[i][1];

            // Calculate purchased + free copies
            int benefit = 0;

            for (int j = 0; j < n; j++) {

                if (items[j][0] % factor == 0) {
                    benefit++;
                }
            }

            // First purchase: only once per item type
            for (int j = budget; j >= price; j--) {

                dp[j] = Math.max(
                    dp[j],
                    dp[j - price] + benefit
                );
            }
        }

        // Spend remaining budget on cheapest item
        int answer = 0;

        for (int j = 0; j <= budget; j++) {

            int extra = (budget - j) / minPrice;

            answer = Math.max(answer, dp[j] + extra);
        }

        return answer;
    }
}

