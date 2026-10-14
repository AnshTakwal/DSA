class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> rev = new ArrayList<>();
        int n = graph.length;
        for(int i = 0 ; i < n ; i++){
            rev.add(new ArrayList<>());
        }
        int[] outdegree = new int[n];
        for(int i = 0; i < n ; i++){
            outdegree[i] = graph[i].length;
            for(int neighbour : graph[i]){
                rev.get(neighbour).add(i);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n ; i++){
            if(outdegree[i] == 0){
                q.offer(i);
            }
        }
        boolean[] safe = new boolean[n];
        while(!q.isEmpty()){
            int node = q.poll();
            safe[node] = true;
            for(int neighbour : rev.get(node)){
                outdegree[neighbour]--;
                if(outdegree[neighbour] == 0){
                   
                    q.offer(neighbour);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            if(safe[i]){
                ans.add(i);
            }
        }
        return ans;
        
    }
}