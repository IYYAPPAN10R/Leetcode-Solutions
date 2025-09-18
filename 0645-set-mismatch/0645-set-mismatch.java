class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a = new int[2];
        HashSet<Integer> b = new HashSet<>();
        int sum = 0;
        for(int n : nums){
            if(!b.contains(n)){
                b.add(n);
                sum += n;
            }
            else{
                a[0] = n;
            }
        }
        int l = nums.length;
        
        a[1] = (l*(l+1))/2 - sum;
        return a;
        
    }
}