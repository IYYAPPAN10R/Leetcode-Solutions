class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            res[i] = greater(i+1,arr);
        }
        return res;
    }
    public int greater(int n , int[] arr){
        if(n > arr.length-1) return -1;
        int max = Integer.MIN_VALUE;
        for(int i = n;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}