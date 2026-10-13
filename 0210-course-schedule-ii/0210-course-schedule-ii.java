class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses ; i++){
            graph.add(new ArrayList<>());
        }
        int[] idx = new int[numCourses];
        for(int[] p : prerequisites){
            int course = p[0];
            int pre = p[1];
            graph.get(pre).add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses ; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0; 
        while(!q.isEmpty()){
            int node = q.poll();
            order[index++] = node;
            for(int neighbour : graph.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.offer(neighbour);

                }
                indegree[node]--;
            }

        }
        if(index != numCourses){
            return new int[0];
        }
        return order;
    }
}