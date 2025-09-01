import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int n1=word1.length();
        int n2=word2.length();
        int MaxL=Math.max(n1,n2);

        for(int i=0;i<MaxL;i++){
            if(i<n1){
                ans+=word1.charAt(i);
            }
            if(i<n2){
                ans+=word2.charAt(i);
            }
        }
        return ans;
        
    }
}