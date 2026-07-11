class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = Double.NEGATIVE_INFINITY;
        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;

            for (int j = i; j < i + k; j++) {
                currentSum += nums[j];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}