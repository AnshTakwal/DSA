class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i = 0; i <= n ; i++){
            graph.add(new ArrayList<>());

        }
        for(int[] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            graph.get(u).add(new int[]{w,v});
        }
        int[] dist = new int[n+1];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];
            if(d > dist[node]){
                continue;
            }
            for(int[] edge : graph.get(node)){
                int weight = edge[0];
                int neighbour = edge[1];
                if(dist[node] + weight < dist[neighbour]){
                    dist[neighbour] = dist[node] + weight;
                    pq.offer(new int[]{dist[neighbour],neighbour});
                }
            }
        }
        int ans = 0;
        for(int i = 1; i < dist.length;i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(ans,dist[i]);
        }
        return ans;

    }
}