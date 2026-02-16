class Solution {
    public int reverseBits(int n) {
    
        String binary1 = Integer.toBinaryString(n);
        while(binary1.length()<32){
            binary1="0"+binary1;
        }
        StringBuilder sb=new StringBuilder(binary1);
        sb.reverse();
        return (int)Long.parseLong(sb.toString(),2);


        
    }
}