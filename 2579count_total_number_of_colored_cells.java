class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return n;
        }else{
            long sum=1;
            for(long i=2;i<=n;i++){ 
                sum = sum+ 4*(i-1);
            }
            return sum;
        }
    }
}
