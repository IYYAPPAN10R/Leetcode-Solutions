class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> a = new ArrayList<>();
        for(int i= 0;i<numCourses;i++){
            a.add(new ArrayList<>());
        }
        int[] inorder = new int[numCourses];
        for(int[] pre : prerequisites){
            int course = pre[0];
            int prerequire = pre[1];
            a.get(prerequire).add(course);
            inorder[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            if(inorder[i] == 0){
                q.add(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()){
            int course = q.poll();
            order[index] = course;
            index++;
            for(int c : a.get(course)){
                inorder[c]--;
                if(inorder[c] == 0)
                    q.add(c);
            }
        }
        
        return index == numCourses ? true : false;
        
    }
}