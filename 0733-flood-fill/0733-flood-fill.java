class Solution {
    public void bfs( Queue<int[]> q ,int color,int[][] matrix,int[][] image,int req){
        while(!q.isEmpty()){
            int[] node = q.poll();
            int r = node[0];
            int c = node[1];
            for(int[] box : matrix){
                int nr = r+box[0];
                int nc = c+box[1];
                if(nr >= 0 && nr < image.length 
                    && nc >= 0 && nc < image[0].length){
                    if(image[nr][nc] == req){
                        image[nr][nc] = color;
                        q.add(new int[]{nr,nc});
                    }
                }
            }

        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q = new LinkedList<>();
        int[][] matrix = {
            {0,-1},
            {-1,0},
            {+1,0},
            {0,+1}
        };
        int req = image[sr][sc];
        if (req == color) {
            return image;
        }
        image[sr][sc] = color;
        q.add(new int[]{sr,sc});
        bfs(q,color,matrix,image,req);
        return image;
    }
}