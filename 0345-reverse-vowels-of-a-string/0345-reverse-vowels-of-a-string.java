class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> a = new ArrayList<>();
        a.add('A');
        a.add('E');
        a.add('I');
        a.add('O');
        a.add('U');
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        ArrayList<Character> b = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(a.contains(s.charAt(i)))
                b.add(s.charAt(i));
        }
        Collections.reverse(b);
        char[] S = s.toCharArray();
        int index = 0;
        for(int i = 0;i<s.length();i++){
            if(a.contains(s.charAt(i)))
                S[i] = b.get(index++);
        }
        return new String(S);
    }
}