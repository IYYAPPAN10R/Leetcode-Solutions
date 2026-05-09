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
        char[] S = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(a.contains(S[left]) && a.contains(S[right])){
                char temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left++;
                right--;
            }
            else if(a.contains(S[left]))
                right--;
            else if(a.contains(S[right])){
                left++;
            }
            else{
                right--;
                left++;
            }
        }
        return new String(S);
    }
}