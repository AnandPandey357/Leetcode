class Solution {
    public int maxFreqSum(String s) {
        int c=0; int v=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v=Math.max(v, hm.get(ch));
            }
            else{
                c=Math.max(c, hm.get(ch));
            }
        }
        return c+v;

        

        
    }
}