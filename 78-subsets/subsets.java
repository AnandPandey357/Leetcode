class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li= new ArrayList<>();
        li.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size= li.size();
            for(int j=0;j<size;j++){
                List<Integer> Subset = new ArrayList<>(li.get(j));
                Subset.add(nums[i]);
                li.add(Subset);
            }
        }
        return li;
        
    }
        
    
}