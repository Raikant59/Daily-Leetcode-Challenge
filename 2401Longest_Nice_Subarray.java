class Solution {
    public int longestNiceSubarray(int[] nums) {
        int s=0;
        int maxsub = 1;
        int bitmask = 0;
        for(int e=0;e<nums.length;e++){
            while((bitmask & nums[e]) !=0 ){
                bitmask = bitmask ^ nums[s];
                s++;
            }
            bitmask = bitmask | nums[e];
            maxsub = Math.max(e-s+1,maxsub);
        }
        return maxsub;
    }
}