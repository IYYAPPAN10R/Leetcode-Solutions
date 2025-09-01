class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> a = new HashSet<>();
        for(char n : jewels.toCharArray()){
            a.add(n);
        }
        int count = 0;
        for(char n : stones.toCharArray()){
            if(a.contains(n)){
                count++;
            }
        }
        return count;
    }
}