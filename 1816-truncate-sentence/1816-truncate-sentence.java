class Solution {
    public String truncateSentence(String s, int k) {
        int sp = 0;
        String res = "";
        int i = 0;
        while(sp<k && i<s.length()){
            if(s.charAt(i) == ' ')sp++;
            if(sp != k)res += s.charAt(i);
            i++;
        }
        return res;
    }
}