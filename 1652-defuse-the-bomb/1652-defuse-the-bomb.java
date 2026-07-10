class Solution {
    public int[] decrypt(int[] code, int k) {
        int result[] = new int[code.length];
        for(int i = 0;i<code.length;i++){
            int t2 = k;
            if(k>0){
                int temp = 0;
                int len = i;
                for(int j = 0;j<k;j++){
                    len = (len+1)%code.length;
                    temp += code[len];
                }
                result[i] = temp;
            }
            else if(k<0){
                int temp = 0;
                int len =  i;
                for(int j = 0;j<-k;j++){
                    if(len == 0){
                        len = code.length-1;
                        temp += code[len];
                    }
                    else{
                        len--;
                        temp+= code[len];
                    }
                }
                result[i] = temp;
            }
            else{
                result[i] = 0;
            }
        }
        return result;
    }
}