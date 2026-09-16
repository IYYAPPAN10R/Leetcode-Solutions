class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        int cui = 0;
        int cud = s.length();
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'I' && cui == 0){
                res[i] = 0;
                cui++;
                sum += res[i];
            }
            else if(s.charAt(i) == 'I'){
                res[i]= cui;
                cui++;
                sum += res[i];
            }
            else{
                res[i] = cud;
                cud--;
                sum += res[i];
            }
        }
        int n = (s.length()*((s.length())+1))/2;
        res[s.length()] = n-sum;
        return res;
    }
}