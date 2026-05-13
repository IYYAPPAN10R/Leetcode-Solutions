class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int   current  = 0;
        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        for(int i = 0;i<k;i++){
            if(a.contains(s.charAt(i))) current++;
        }
        max = Math.max(max,current);
        for(int i = k;i<s.length();i++){
            if(a.contains(s.charAt(i-k))) current--;
            if(a.contains(s.charAt(i)))   current++;
            max = Math.max(max,current);
            if(max == k) return max;
        }
        return max;
    }
}