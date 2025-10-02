import java.util.*;
class Solution {
    public int triangularSum(int[] nums) {
        int a=nums.length;
        while(a>1){
            int arr[]=new int [a-1];
            for(int i=0;i<a-1;i++){
                nums[i]=(nums[i]+nums[i+1]) %10;
            }
            a--;
        }
        return nums[0];

        
    }
}