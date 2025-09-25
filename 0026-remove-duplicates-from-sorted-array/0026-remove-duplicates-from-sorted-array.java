class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        int[] b = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            b[i]  = nums[i];
        }
        int j = 0;
        for(int num : b){
            if(!a.contains(num)){
                nums[j] = num;
                a.add(num);
                j++;
            }
        }
        return j;
    }
}