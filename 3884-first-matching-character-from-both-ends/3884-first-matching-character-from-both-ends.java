class Solution {
    public int firstMatchingIndex(String s) {
        int l = 0;
        int r = s.length()-1;
        int res = 0;
        while(l<=r){
            if(s.charAt(l) == s.charAt(r)) return res;
            res++;
            l++;
            r--;
        }
        return -1;
    }
}