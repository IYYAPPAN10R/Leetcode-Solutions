class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(isprime(m.getValue())){
                return true;
            }
        }
        return false;
    }
    public boolean isprime(int n){
        if(n  == 1) return false;
        if(n == 2 || n == 3) return true;
        for(int i = 2;i<=n/2;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}