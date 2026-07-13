class Solution {
    public int numberOfSteps(int num) {
       return helper(num,0);
    }
    public static int helper(int num , int c){
        if(num%2 != 0){
            num = num-1;
            c++;
        }
        if(num == 0){
            return c;
        }
        c = c+1;
        return helper(num/2,c);
    }
}