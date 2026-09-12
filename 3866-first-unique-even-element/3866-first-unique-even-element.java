class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i= 0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] %2 == 0 && a.get(nums[i]) == 1) return nums[i];
        }
        return -1;
    }
}