class Solution {

    public String star(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> exact = new HashSet<>();
        int n = queries.length;
        String[] ans = new String[n];
        HashMap<String, String> capital = new HashMap<>();
        HashMap<String, String> vowel = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);

            String upper = word.toUpperCase();
            capital.putIfAbsent(upper, word);

            String str = star(upper);
            vowel.putIfAbsent(str, word);
        }

        for (int i = 0; i < queries.length; i++) {
            String s = queries[i];
            if (exact.contains(s)) {
                ans[i] = s;
                continue;
            }
            String upper = s.toUpperCase();
            if (capital.containsKey(upper)) {
                ans[i] = capital.get(upper);
                continue;
            }
            String str = star(upper);
            ans[i] = vowel.getOrDefault(str, "");
        }
        return ans;
        
    }
    

        
    
}