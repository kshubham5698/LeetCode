class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int count : nums){
            sum+=count;
        }
        int totalSum = n*(n+1)/2;
        return totalSum - sum;
    }
}