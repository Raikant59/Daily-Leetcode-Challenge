class Solution {
    public int maximumCount(int[] nums) {
        int negcount = 0;
        int poscount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negcount++;
            }else if(nums[i]>0){
                poscount++;
            }
        }
        int max = Math.max(negcount,poscount);
        return max;
    }
}