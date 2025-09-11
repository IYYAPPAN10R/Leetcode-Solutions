class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a = new HashMap<>();
        HashSet<Integer> b = new HashSet<>();
        for(int n : arr){
            a.put(n,a.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : a.entrySet()){
            if(b.contains(entry.getValue())){
                return false;
            }
            b.add(entry.getValue());
        }
        return true;
        
    }
}