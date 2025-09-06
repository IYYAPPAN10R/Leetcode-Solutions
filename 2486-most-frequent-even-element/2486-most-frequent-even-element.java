class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int n : nums){
            if(n%2 == 0){
                a.put(n,a.getOrDefault(n,0)+1);
            }
        }
        int min = Integer.MIN_VALUE;
        int result = -1;
        for(int n : nums){
            if(n%2 == 0){
                if(min < a.get(n)){
                    min = a.get(n);
                    result = n;
                }           
            }
        }
        return result;
    }
}