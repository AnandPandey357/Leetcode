class Solution {
    private boolean isP(int x){
        if(x<2){
            return false;
        }
        for(int d=2;d*d<=x;d++){
            if(x%d==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int bits=Integer.bitCount(i);
            if(isP(bits)){
                count++;
            }

        }
        return count;
        
    }
}