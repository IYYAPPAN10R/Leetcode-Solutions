class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> a = new Stack<>();
        for(int n : asteroids){
            boolean temp = false;
            while(!a.isEmpty() && n < 0 && a.peek()>0){
                if(a.peek() < -n){
                    a.pop();
                }
                else if(a.peek() == -n){
                    a.pop();
                    temp = true;
                    break;
                }
                else{
                    temp = true;
                    break;
                }
            }
            if(!temp){
                a.push(n);
            }
        }
        int[] result = new int[a.size()];
        for(int i  = a.size()-1;i>=0;i--){
            result[i] = a.pop();
        }
        return result;

    }
}