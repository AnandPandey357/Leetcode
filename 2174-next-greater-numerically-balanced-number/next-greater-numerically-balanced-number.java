class Solution {
    public int nextBeautifulNumber(int n) {
         int m = n+1;
         while(m<62466666)  {
            if(balanced(m)) {
                return m;
            } else {
                m++;
            }
         }
return 0;
    }
    private boolean balanced(int m)  {
        HashMap<Character,Integer> mpp = new HashMap<>();
        String temp = String.valueOf(m);
        for(char ch : temp.toCharArray()) {
            mpp.put(ch , mpp.getOrDefault(ch , 0)+1);
        }
        for(Character i : mpp.keySet()) {
            if(mpp.get(i) != Integer.valueOf(i - '0')) return false;
        }
        return true;
    
 
        
    }
}