class Solution {
    public int countCharacters(String[] words, String chars) {
        ArrayList<Character> a = new ArrayList<>();
        for(char i : chars.toCharArray()){
            a.add(i);
        }
        int res = 0;
        for(int i= 0;i<words.length;i++){
            int r =  words[i].length();
            String temp = words[i];
            ArrayList<Character> b = new ArrayList<>(a);
            int f = 0;
            for(int j = 0;j<r;j++){
                if(b.contains(temp.charAt(j))){
                    b.remove(Character.valueOf(temp.charAt(j)));
                }
                else{
                    f =1;
                    break;
                }
            }
            if(f!= 1) res += words[i].length();
        }
        return res;
    }
}