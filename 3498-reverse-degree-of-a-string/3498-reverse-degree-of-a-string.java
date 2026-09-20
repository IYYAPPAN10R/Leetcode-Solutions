class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        int val = 26;
        for(int i = 0;i<26;i++){
            a.put((char)('a'+i),val--);
        }
        int sum =0;
        int ind = 1;
        for(char n : s.toCharArray()){
            sum += a.get(n)*ind;
            ind++;
        }
        return sum;
    }
}