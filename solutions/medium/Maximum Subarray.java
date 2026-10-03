// Title: Maximum Subarray
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray/

            currsum += nums[i];
            largest = Math.max(currsum, largest);
        }
            if(currsum < 0){
            
                currsum = 0;
            }
        for(int i=0; i<nums.length; i++){
        int currsum = 0, largest = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        return largest;
class Solution {
