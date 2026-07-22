class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> a  = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            a.add(i);
        }
        int temp  = 0;
        while(a.size() > 1){
            temp += k-1;
            temp = temp%a.size();
            a.remove(temp);
        }
        return a.get(0);
    }
}