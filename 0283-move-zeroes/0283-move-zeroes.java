class Solution {
    public void moveZeroes(int[] a) {
       int z = 0;
       for(int i = 0;i<a.length;i++){
        if(a[i] != 0){
            int temp = a[i];
            a[i] = a[z];
            a[z] = temp;
            z++;
        }
       }
    }
}