class Solution {
    public long minimumSteps(String s) {
        long z = 0;
        long res = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == '0')z++;
            if(s.charAt(i) == '1')res = res+z;
        }
        return res;
    }
}