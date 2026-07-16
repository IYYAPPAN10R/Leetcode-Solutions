class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        char[] b = word.toCharArray();
        for(char n : b){
            if(n == ch){
                break;
            }
            index++;
        }
        int left = 0;
        int right = index;
        if(index < word.length()){
            while(left<right){
                char temp = b[left];
                b[left] = b[right];
                b[right] = temp;
                left++;
                right--;
            }
        }
        return new String(b);
    }
}