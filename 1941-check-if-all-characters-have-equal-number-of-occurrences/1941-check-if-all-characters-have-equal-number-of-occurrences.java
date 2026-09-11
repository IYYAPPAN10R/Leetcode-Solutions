class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : a.entrySet()){
            if(!entry.getValue().equals(a.get(s.charAt(0)))) return false;
        }
        return true;
    }
}