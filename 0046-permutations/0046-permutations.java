class Solution {
    public void hello(List<List<Integer>> a ,int[] nums ,int i){
        if(i == nums.length){
            List<Integer> permutation   = new ArrayList<>();
            for(int num: nums){
                permutation.add(num);
            }
            a.add(permutation);
            return;
        }
        for(int j = i;j<nums.length;j++){
            swap(nums,i,j);
            hello(a,nums,i+1);
            swap(nums,i,j);
        }
    }
    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        hello(a,nums,0);
        return a; 
    }
}