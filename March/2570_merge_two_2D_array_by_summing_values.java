import java.util.*;
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i < nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i][0])){
                int val1 = map.get(nums2[i][0]);
                int val2 = nums2[i][1];
                int final1 = val1+val2;
                map.put(nums2[i][0],final1);
            }else{
                map.put(nums2[i][0],nums2[i][1]);
            }
        }
        int [][] array = new int[map.size()][2];

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            array[i][0] = entry.getKey();
            array[i][1] = entry.getValue();
            i++;
        }

        return array;
    }
}
