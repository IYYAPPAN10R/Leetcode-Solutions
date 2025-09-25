class Solution {
    public int removeElement(int[] nums, int val) {
        int[] a = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            a[i] = nums[i];
        }
        int j = 0;
        for(int num : a){
            if(num != val){
                nums[j] = num;
                j++;
            }
        }
        return j;
        
    }
}