class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        for(int num : nums1) a.add(num);
        for(int num : nums2) b.add(num);
        for(int num : nums1) {
            if(!b.contains(num) && !a1.contains(num)) a1.add(num);
        }
        result.add(a1);
        for(int num : nums2){
            if(!a.contains(num) && !b1.contains(num)) b1.add(num);
        }
        result.add(b1);
        return result;

    }
}