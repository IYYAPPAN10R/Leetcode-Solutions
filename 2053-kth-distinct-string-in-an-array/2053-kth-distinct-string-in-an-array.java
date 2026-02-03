class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> a = new LinkedHashMap<>();
        for(String b : arr){
            a.put(b,a.getOrDefault(b,0)+1);
        }
        int count = 0;
        for(Map.Entry<String , Integer> map : a.entrySet()){
            if(map.getValue() == 1){
                count++;
                if(count == k){ 
                    return map.getKey();
                }
            }
        }
        return "";
    }
}