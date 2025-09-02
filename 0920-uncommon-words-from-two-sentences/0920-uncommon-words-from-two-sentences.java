class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> a = new HashMap<>();
        ArrayList<String> b = new ArrayList<>();
        String[] s3 = s1.split(" ");
        String[] s4 = s2.split(" ");
        for(String n : s3){
            a.put(n,a.getOrDefault(n,0)+1);
        }
        for(String n : s4){
            a.put(n,a.getOrDefault(n,0)+1);
        }
        for(String n : a.keySet()){
            if(a.get(n) == 1){
                b.add(n);
            }
        }
        String[] result = b.toArray(new String[0]); 
        return result;
    }
}