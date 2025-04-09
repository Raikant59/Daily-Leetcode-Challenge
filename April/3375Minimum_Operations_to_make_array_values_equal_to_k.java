import java.util.*;
class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        boolean istrue = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k && !set.contains(nums[i])){
                set.add(nums[i]);
            }
            if(nums[i]<k){
                istrue = true;
                break;
            }else{
                istrue = false; 
            }
        }
        if(istrue){
            return -1;
        }else{
            return set.size();
        }
    }
}