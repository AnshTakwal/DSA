class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge :  prerequisites){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses ; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0 ;
        while(!q.isEmpty()){
            int node = q.remove();
            count++;
            for(int neighbour : graph.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }
        }
        return count == numCourses;
    }
}