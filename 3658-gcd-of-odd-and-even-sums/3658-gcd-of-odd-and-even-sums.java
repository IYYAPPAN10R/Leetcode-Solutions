class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumO = n*n;
        int sumE = n*(n+1);
        return GCD(sumO,sumE);
    }
    public int GCD(int sumO,int sumE){
        if(sumE == 0) return sumO;
        return GCD(sumE,sumO%sumE);
    }
}