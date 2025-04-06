
class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[]=new int[right-left+1];
        int j=0;
        for(int i=left;i<=right;i++){
            if(CheckPrime(i)==true){
                arr[j++]=i;
            }
        }
        int ans[]=new int[2];
        if(arr[0]==0||arr[1]==0){
            ans[0]=-1;
            ans[1]=-1;
        }else{
            int min =Integer.MAX_VALUE;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=0 && arr[i+1]!=0){
                    if(arr[i+1]-arr[i]<min){
                        int val = arr[i+1]-arr[i];
                        min = Math.min(val,min);
                        ans[0]=arr[i];
                        ans[1]=arr[i+1];
                    }
                }
            }
        }
        return ans;
    }

    static boolean CheckPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}