class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str = Integer.toString(i);
            if(str.length()%2 != 0){
                continue;
            }
            int len1=str.length()/2;
            int rightsum = 0;
            int leftsum = 0;
            for(int j=0;j<len1;j++){
                leftsum+=str.charAt(j)-'0';
            }
            for(int k=len1;k<str.length();k++){
                rightsum+=str.charAt(k)-'0';
            }
            if(rightsum == leftsum){
                count++;
            }
        }
        return count;
    }
}