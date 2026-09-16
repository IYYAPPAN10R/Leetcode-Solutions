class Solution {
    public boolean lemonadeChange(int[] bills) {
       int f = 0;
       int t = 0;
       int twen = 0;
       for(int i = 0;i<bills.length;i++){
        if(bills[i] == 5){
            f++;
        }
        if(bills[i] == 10){
            if(f == 0) return false;
            t++;
            f--;
        }
        if(bills[i] == 20){
            if((f == 0 || t == 0) && (f<3)) return false;
            if(f!= 0 && t != 0){ 
            twen++;
            t--;
            f--;
            }
            else{
                f -= 3;
            }
        }
       }    
       return true;
    }
}