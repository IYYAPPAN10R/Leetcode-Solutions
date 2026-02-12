class Solution {
    public int maxFreqSum(String s) {
        ArrayList<Character> a =new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        HashMap<Character,Integer> r = new HashMap<>();
        for(char v : s.toCharArray()){
            r.put(v,r.getOrDefault(v,0)+1);
        }
        int max1 = 0;
        int max2 = 0;
        for(char v : s.toCharArray()){
            if(a.contains(v)){
                if(r.get(v)>max1){
                    max1 = r.get(v);
                }
            }
            else{
                if(r.get(v)>max2){
                    max2 = r.get(v);
                }
            }
        }
        return max1+max2;

    }
}