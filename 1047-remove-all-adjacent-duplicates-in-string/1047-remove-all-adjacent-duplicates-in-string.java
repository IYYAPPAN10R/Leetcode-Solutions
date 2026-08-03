class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(a.isEmpty()||a.peek() != s.charAt(i)){
                a.push(s.charAt(i));
            }
            else if(a.peek() == s.charAt(i)){
                a.pop();
            }
        }
        String res = "";
        while(!a.isEmpty()){
            res = a.pop()+res;
        }
        return res;
    }
}