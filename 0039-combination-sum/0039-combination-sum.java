class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(can);
        backtrack(can, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] can, int remain, int start, List<Integer> temp, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < can.length; i++) {
            if (can[i] > remain) {
                break;
            }
            temp.add(can[i]);
            backtrack(can, remain - can[i], i, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
