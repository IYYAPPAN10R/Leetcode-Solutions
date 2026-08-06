class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int[] a = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
         int i =0;
        for(char num : s.toCharArray()){
            int n = map.get(num);
            if(i>0 && a[i-1]<n){
                a[i-1] = n-a[i-1];
            }
            else{
                a[i] = n;
                i++;
            }
        }
       for(i = 0;i<a.length;i++){
        sum = sum+ a[i];
       }
       return sum;
    }
}