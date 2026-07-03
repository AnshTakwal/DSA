class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        Queue<int[]> q = new LinkedList<>();
        for(char ch : tasks){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for( int values : hm.values()){
            pq.offer(values);
        }
        int time = 0;
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int count  = pq.poll();
                count--;
                if(count>0){
                    q.offer(new int[]{count,time+n});
                }
            }
            if(!q.isEmpty()){
                if(q.peek()[1]==time){
                    pq.offer(q.poll()[0]);
                }
            }
        }
        return time;

    }
}