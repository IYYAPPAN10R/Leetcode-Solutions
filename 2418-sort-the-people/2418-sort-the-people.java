class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> a = new HashMap<>();
        for(int i = 0;i<names.length;i++){
            a.put(heights[i],names[i]);
        }
        Integer[] heightsInt = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(heightsInt, Collections.reverseOrder());
        String res[] = new String[names.length];
        for(int i = 0;i<names.length;i++){
            res[i] = a.get(heightsInt[i]);
        }
        return res;
    }
}