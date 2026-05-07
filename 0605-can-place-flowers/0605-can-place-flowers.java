class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int a = 0;
        int l = f.length;
        for(int i = 0;i<l;i++){
            if(f[i] == 0){
                int prev = i==0 ? 0 : f[i-1];
                int next = i == l-1 ? 0 : f[i+1];
                if(prev == 0 && next == 0){ 
                a++;
                f[i] = 1;
            }
        }
        }
        return a>=n ? true:false;
    }
}