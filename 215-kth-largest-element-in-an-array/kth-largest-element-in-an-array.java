import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        // PriorityQueue <Integer> pq=new PriorityQueue <>(Collections.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        
        // while(k!=1){
        //     pq.remove();
        //     k--;
        // }
        // return pq.peek(); 
        
        Arrays.sort(nums);
        return nums[n-k];
        
    }  
    
}

