class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> a = new HashSet<>();
        int i = 0;
        for(int num : nums){
            if(!a.contains(num)){
                a.add(num);
            }
            else{
                result[i] = num;
                i++;
            }
        }
        return result;
    }
}