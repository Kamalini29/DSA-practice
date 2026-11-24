class max{
    public int maxLength(int[] nums) {
        int n = nums.length;
        long totalLcm = 1;
        int maxVal = 0;

        for (int num : nums) {
            totalLcm = lcm(totalLcm, num);
            maxVal = Math.max(maxVal, num);
        }

        long maxProd = totalLcm * maxVal;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                if (prod > maxProd) {
                    break;
                }
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (prod == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}