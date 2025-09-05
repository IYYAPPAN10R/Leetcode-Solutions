class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            result[i] = a.get(i);
        }
        return result;
    }
}