class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>(); 
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        List<Integer> a1 = new ArrayList<>();
        List<Integer> b1 = new ArrayList<>();
        for(int num : nums1) a.add(num);
        for(int num : nums2) b.add(num);
        for(int num : a) {
            if(!b.contains(num)) a1.add(num);
        }
        result.add(a1);
        for(int num : b){
            if(!a.contains(num)) b1.add(num);
        }
        result.add(b1);
        return result;

    }
}