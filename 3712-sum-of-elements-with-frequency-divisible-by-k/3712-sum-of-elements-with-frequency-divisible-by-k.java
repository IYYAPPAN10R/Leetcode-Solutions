class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int num : nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> map : a.entrySet()){
            if(map.getValue()%k == 0){
                result = result + (map.getKey()*map.getValue());
            }
        }
        return result;
    }
}