class Solution {
    public boolean notC(int n){
        return !String.valueOf(n).contains("0");
        
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            int j=n-i;
            if(notC(i) && notC(j)){
                return new int[]{i,j};

            }
        }
        return new int[]{-1,-1};
        
    }
}