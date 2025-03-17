class Solution {
    public int numberOfSubstrings(String s) {
        int[] set = new int[3]; 
        int left = 0, count = 0;
        
        for (int right = 0; right < s.length(); right++) {
            set[s.charAt(right) - 'a']++; 
           
            while (set[0] > 0 && set[1] > 0 && set[2] > 0) {
                count += s.length() - right; 
                set[s.charAt(left) - 'a']--; 
                left++;
            }
        }
        return count;
    }
}
