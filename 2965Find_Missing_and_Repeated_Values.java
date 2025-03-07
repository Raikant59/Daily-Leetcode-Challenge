import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[k++]=grid[i][j];
            }
        }
        int val1 = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
              val1 = arr[i];
            }
        }
        int val2=0;
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                val2 = i;
            }
        }
       int ans[]=new int[2];
       ans[0]=val1;
       ans[1]=val2;
       return ans;
    }
}