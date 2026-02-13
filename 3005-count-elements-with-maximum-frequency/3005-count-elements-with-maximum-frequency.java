class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> a  = new HashMap<>();
        for(int num : nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> map : a.entrySet()){
            if(map.getValue()>max){
                max = map.getValue();
            }
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> map : a.entrySet()){
            if(map.getValue() == max){
                result += max;
            }
        }
        return result;

    }
}