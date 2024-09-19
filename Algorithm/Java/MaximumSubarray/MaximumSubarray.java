 /*
     * Given an integer array nums, find the subarray
     * with the largest sum, and return its sum.
     * 
     * Constraints
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     * 
     * Follow up: If you have figured out the O(n) solution,
     * try coding another solution using the divide and conquer approach, which is more subtle.
     */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum > max) {
                max = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}
