class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();

        char replace = '9';
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i] = replace;
                break;
            }
        }

        int ans = Integer.parseInt(new String(arr));
        return ans;
        
    }
}