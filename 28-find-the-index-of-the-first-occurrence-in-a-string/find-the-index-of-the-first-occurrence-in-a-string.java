class Solution {
    public int strStr(String n, String m) {
        if (m.length() == 0) return 0; // Edge case: empty needle

        // Try every possible starting index
        for (int i = 0; i <= n.length() - m.length(); i++) {
            int j = 0;
            // Compare character by character
            while (j < m.length() && n.charAt(i + j) == m.charAt(j)) {
                j++;
            }
            // If we matched the whole needle
            if (j == m.length()) return i;
        }
        return -1; // Not found
        
    }
}