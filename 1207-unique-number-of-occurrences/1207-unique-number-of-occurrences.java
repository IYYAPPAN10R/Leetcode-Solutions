class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a = new HashMap<>();
        HashSet<Integer> b = new HashSet<>();
        for(int num : arr){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> map : a.entrySet()){
            if(b.contains(map.getValue())) return false;
            else b.add(map.getValue());
        }
        return true;
    }
}