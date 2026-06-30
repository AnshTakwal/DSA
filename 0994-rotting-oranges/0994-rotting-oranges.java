class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] ==  2){
                    q.offer(new int[]{i,j});   
                }else{
                    if(grid[i][j] ==  1){
                        fresh++;
                    }
                }
            }
        }
        if(fresh==0) return 0;
        int[][] dir = {{1,0},
        {-1,0},
        {0,1},
        {0,-1}

        };
        int time = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean changed = false;
            for(int i = 0;i<size;i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int d[] : dir){
                    int nr = d[0] + r;
                    int nc = d[1] + c;
                    if(nr >=0 && nr <n && nc >= 0 && nc <m && grid[nr][nc]==1){
                        grid[nr][nc] = 2;
                        changed = true;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                
                }

            }
            if(changed){
                time++;
            }  
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }
}