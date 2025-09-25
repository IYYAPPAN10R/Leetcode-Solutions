class Solution {
    public int removeElement(int[] nums, int val) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int num : nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        int i = 0;
        for(int num :nums){
            if(a.containsKey(num) && num == val){ 
                a.remove(num);
            }
            else if(num != val){
                nums[i] = num;
                i++; 
            }
        }
        return i;
        
    }
}