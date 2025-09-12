class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count = new int[26];

        for (char c : word1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            count[c - 'a']--;
        }

        for (int diff : count) {
            if (Math.abs(diff) > 3) {
                return false;
            }
        }
        return true;
    }
}
