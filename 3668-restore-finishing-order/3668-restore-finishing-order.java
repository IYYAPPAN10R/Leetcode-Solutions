class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> a= new ArrayList<>();
        for(int n : friends){
            a.add(n);
        }
        int ind = 0;
        for(int n : order){
            if(a.contains(n))
            friends[ind++] = n;
        }
        return friends;
    }
}