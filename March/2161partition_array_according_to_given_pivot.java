class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // ArrayList<Integer> arr1 = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<pivot){
        //         arr1.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==pivot){
        //         arr1.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>pivot){
        //         arr1.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<arr1.length;i++){
        //     nums[i]=arr1.get(i);
        // }
        // return nums;
        int []arr1 = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                arr1[left]=nums[i];
                left++;
            }
            if(nums[j]>pivot){
                arr1[right]=nums[j];
                right--;
            }
        }
        while(left<=right){
            arr1[left]=pivot;
            left++;
        }
        for(int i=0;i<arr1.length;i++){
            nums[i]=arr1[i];
        }
        return nums;
    }
}