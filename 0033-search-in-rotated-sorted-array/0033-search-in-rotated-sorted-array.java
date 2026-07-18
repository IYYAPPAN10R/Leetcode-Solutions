class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public int helper(int[] nums ,int tar , int st, int end){
        if(st>end) return -1;
        int mid = st+(end-st)/2;
        if(nums[mid] == tar) return mid;
        if(nums[st]<=nums[mid]){
            if(tar <= nums[mid] && tar >= nums[st]){
                end = mid-1;
                return helper(nums,tar,st,end);
            }
            else{
                st = mid+1;
                return helper(nums,tar,st,end);
            }
        }
        if(tar >= nums[mid] && tar<= nums[end]){
            st = mid+1;
             return helper(nums,tar,st,end);
        }
        else{
            end = mid-1;
             return helper(nums,tar,st,end);
        }
    }
}