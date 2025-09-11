class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> a = new HashMap<>();
        for(char n : word.toCharArray()){
            if(n == Character.toLowerCase(n)){
                a.put(n,a.getOrDefault(n,0)+1);
            }
        }
        int count = 0;
        for(char n : word.toCharArray()){
            if(n == Character.toUpperCase(n)){
                if(a.containsKey(Character.toLowerCase(n))){
                    count++;
                    a.remove(Character.toLowerCase(n));
                }

            }
        }
        return count;
    }
}