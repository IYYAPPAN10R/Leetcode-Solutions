class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int num : nums){
            a.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ;i<nums.length;i++){
            if(!a.contains(i+1)){
                result.add(i+1);
            }
        }
        return result;
    }
}