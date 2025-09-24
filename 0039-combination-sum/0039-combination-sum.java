class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(can);
        fun(can , target , a , 0 ,new ArrayList<>());
        return a;
    }
    public void fun(int[] num , int target , List<List<Integer>> a ,int index,List<Integer> temp){
        int sum = Sum(temp);
        if(sum > target){
            return;
        }
        if(index >= num.length){
            return;
        }
        if(sum == target){
            a.add(new ArrayList<>(temp));
            return;
        }

        temp.add(num[index]);
        fun(num,target,a,index,temp);
        temp.remove(temp.size()-1);
        fun(num,target,a,index+1,temp);
    }
    public int Sum(List<Integer> list){
        int sum = 0;
        for(int n : list){
            sum += n; 
        }
        return sum;
    }
}