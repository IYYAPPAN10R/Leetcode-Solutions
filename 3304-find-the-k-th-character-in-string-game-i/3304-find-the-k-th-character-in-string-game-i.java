class Solution {
    public char kthCharacter(int k) {
        return helper1(k-1, "a");
    }
    public char helper1(int k , String a){
        if(a.length()>k){
            return a.charAt(k);
        }
        String temp1 = "";
        for(int i = 0;i<a.length();i++){
            char temp = a.charAt(i);
            temp1 += (char)(temp+1);
        }
        a += temp1;
        return helper1(k,a);
    }
}