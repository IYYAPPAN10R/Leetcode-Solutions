class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();
        for(int n : nums){
            if(!a.contains(n)){
                a.add(n);
            }
            else{
                return n;
            }
        }
        return -1;
    }
}