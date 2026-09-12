class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            int l = 0;
            int r = i+1;
            int ls = 0;
            int rs = 0;
            while(l<i){
                ls += nums[l];
                l++;
            }
            while(r<nums.length){
                rs += nums[r];
                r++;
            }
            if(ls == rs) return i;
        }
        return -1;
    }
}