class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int max = 0;
        int st = 0;
        int end = 0;
        HashSet<Character> f = new HashSet<>();
        while(end<s.length() && st<s.length()){
            if(!f.contains(s.charAt(end))){
                f.add(s.charAt(end));  
                max = Math.max(max, end - st + 1);
                end++;              
            }
            else{
                st++;
                end = st;
                f.clear();
            }
        }
        return max == 0 ? 1 : max;
    }
}