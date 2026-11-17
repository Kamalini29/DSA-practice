package Daily_checkin;

import java.util.*;


public class minimum {
    
    public int minimumChanges(String s, int k) {

        int n = s.length();

        // STEP 1: Precompute cost of every substring

        int[][] cost = new int[n][n];

        for (int len = 2; len <= n; len++) {

            for (int start = 0; start + len <= n; start++) {

                int end = start + len - 1;

                int minCost = Integer.MAX_VALUE;

                // Try every proper divisor
                for (int d = 1; d < len; d++) {

                    if (len % d != 0) {
                        continue;
                    }

                    int groupSize = len / d;
                    int changes = 0;

                    // Check each group
                    for (int r = 0; r < d; r++) {

                        // Compare symmetric characters
                        for (int t = 0; t < groupSize / 2; t++) {

                            int left = start + r + t * d;

                            int right = start + r
                                      + (groupSize - 1 - t) * d;

                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }
                        }
                    }

                    minCost = Math.min(minCost, changes);
                }

                cost[start][end] = minCost;
            }
        }

        // STEP 2: Dynamic Programming

        int INF = 1000000000;

        int[][] dp = new int[k + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        // Base case
        dp[0][0] = 0;

        // Number of parts
        for (int parts = 1; parts <= k; parts++) {

            // Number of characters considered
            for (int i = 2 * parts; i <= n; i++) {

                // Starting position of last substring
                for (int j = 2 * (parts - 1); j <= i - 2; j++) {

                    if (dp[parts - 1][j] == INF) {
                        continue;
                    }

                    dp[parts][i] = Math.min(
                        dp[parts][i],
                        dp[parts - 1][j] + cost[j][i - 1]
                    );
                }
            }
        }

        return dp[k][n];
    }
}
