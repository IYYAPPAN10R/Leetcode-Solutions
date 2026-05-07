class Solution {
    public String mergeAlternately(String w1, String w2) {
        int l = w1.length()+w2.length();
        char[] a = new char[l];
        int s1 = 0;
        int s2 = 0;
        int r = 0;
        while(s1<w1.length() && s2 < w2.length()){
            a[r++] = w1.charAt(s1++);
            a[r++] = w2.charAt(s2++);
        }
        while(s1<w1.length()){
            a[r++] = w1.charAt(s1++);
        }
        while(s2<w2.length()){
            a[r++] = w2.charAt(s2++);
        }

        return new String(a);
    }
}