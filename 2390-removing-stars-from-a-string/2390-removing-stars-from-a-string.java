class Solution {
    public String removeStars(String s) {
        Stack<Character> a = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*') a.pop();
            else a.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while(!a.isEmpty()){
            result.append(a.pop());
        }
        return result.reverse().toString();
    }
}