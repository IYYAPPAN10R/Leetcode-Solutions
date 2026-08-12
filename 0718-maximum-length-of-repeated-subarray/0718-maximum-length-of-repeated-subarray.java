class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    max = Math.max(max,hello(nums1,nums2,i,j));
                }
            }
        }
        return max;
    }
    public int hello(int[] nums1,int[] nums2 , int f , int s){
        int i = f;
        int j = s;
        int count = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]) count++;
            else break;
            i++;
            j++; 
        }
        return count;
    }
}