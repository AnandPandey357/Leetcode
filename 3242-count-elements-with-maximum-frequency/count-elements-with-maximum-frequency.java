class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] frequency = new int[101];
        for (int num : nums) {
            frequency[num]++;
        }
        int maxFreq = 0;
        for (int freq : frequency) {
            maxFreq = Math.max(maxFreq, freq);
        }
        int totalElements = 0;
        for (int freq : frequency) {
            if (freq == maxFreq) {
                totalElements += freq;
            }
        }
        return totalElements;
    }
}