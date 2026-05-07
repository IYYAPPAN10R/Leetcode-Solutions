class Solution {
    int GCD(int x , int y){
        if(y == 0) return x;
        return GCD(y,x%y);
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int len = GCD(str1.length() , str2.length());
        return str1.substring(0,len);
    }
}