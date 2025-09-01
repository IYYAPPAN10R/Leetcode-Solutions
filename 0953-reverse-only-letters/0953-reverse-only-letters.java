class Solution {
    public String reverseOnlyLetters(String s) {
        String a = s;
        char[] r = s.toCharArray();
        String clear = a.replaceAll("[^a-zA-Z]","");
        char[] b = clear.toCharArray();
        String reversed ="";
        for(int i = b.length-1;i>=0;i--){
            reversed += Character.toString(b[i]);
        }
        String result = "";
        int j = 0;
        for(int i = 0;i<r.length;i++){
            if(Character.isLetter(r[i])){
                result +=reversed.charAt(j);
                j++;
            }
            else{
                result += Character.toString(r[i]);
            }
        }
        return result;
    }
}