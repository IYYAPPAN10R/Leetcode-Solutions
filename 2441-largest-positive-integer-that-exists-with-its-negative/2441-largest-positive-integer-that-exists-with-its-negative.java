class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer> a = new  ArrayList<>();
        for(int n : nums){
            a.add(n);
        }
        Arrays.sort(nums);
        for(int n : nums){
            if(n < 0){
                if(a.contains(-1*n)){
                    return -1*n;
                }
            }
        }
        return -1;

    }
}