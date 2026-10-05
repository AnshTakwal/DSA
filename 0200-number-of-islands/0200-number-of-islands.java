class Solution {
    public void bfs(char[][] grid,int i , int j){
        Queue<int[]> q = new LinkedList<>();
        int[][] matrix = {
            {1,0},
            {0,-1},
            {-1,0},
            {0,1}
        };
        grid[i][j] = '0';
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] node = q.poll();
            int r = node[0];
            int c = node[1];
            for(int[] dir : matrix){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'){
                    grid[nr][nc] = '0';
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
       
        int count = 0;
        for(int i = 0 ; i < grid.length ;i++){
            for(int j = 0; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid,i,j);
                }
            }
        } 
        return count;
    }
}