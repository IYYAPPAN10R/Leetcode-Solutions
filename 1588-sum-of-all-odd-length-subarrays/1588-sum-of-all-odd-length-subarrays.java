class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int it = 1;
        int sum = 0;
        while(it<=arr.length){
            for(int i = 0;i<arr.length;i++){
                if(i+it>arr.length)break;
                int f = 0;
                int ind = i;
                while(f<it && ind<arr.length){
                    sum += arr[ind];
                    ind++;
                    f++;
                }
            }
            it += 2;
        }
        return sum;
    }
}