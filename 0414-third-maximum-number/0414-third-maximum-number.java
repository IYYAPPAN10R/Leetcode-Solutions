class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> a = new TreeSet<>(Collections.reverseOrder());
        for(int n : nums){
            a.add(n);
        }
        if(a.size()<=2){
            return a.first();
        }
        int i = 0;
        for(int n : a){
            if(i == 2){
                return n;
            }
            i++;
        }
        return 0;
    }
}