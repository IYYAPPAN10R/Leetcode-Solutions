class Solution {
    public boolean maximum(int max , int[] candies){
        for(int i = 0;i<candies.length;i++){
            if(max<candies[i]) return false;
        }
        return true;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
        List<Boolean> result = new ArrayList<>();
        for(int i = 0;i<candies.length;i++){
            int max = candies[i]+ex;
            if(maximum(max,candies)){
                result.add(i,true);
            }
            else{
                result.add(i,false);
            }
        }
        return result;
    }
}