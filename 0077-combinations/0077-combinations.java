class Solution {
    public void sub(List<List<Integer>>result , int[] num , int index , List<Integer>temp ,int k){
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(index>num.length-1){
            return;
        }
        temp.add(num[index]);
        sub(result, num , index+1 , temp,k);
        temp.remove(temp.size()-1);
        sub(result,num ,index+1,temp,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]  = i+1;
        }
        List<List<Integer>> result = new ArrayList<>();
        sub(result ,a,0,new ArrayList<>(),k);
        return result;
    }
}