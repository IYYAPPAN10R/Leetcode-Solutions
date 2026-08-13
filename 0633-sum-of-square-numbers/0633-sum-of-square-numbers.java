class Solution {
    public boolean judgeSquareSum(int c) {
        if(c == 0 || c == 1 || c == 2) return true;
        long a = 0;
        long b = (long)Math.sqrt(c);
        while(a<=b){
            if(a*a + b*b == c) return true;
            else if(a*a + b*b > c)b--;
            else a++;
        }
        return false;
    }
}