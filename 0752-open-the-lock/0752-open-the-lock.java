class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        if(dead.contains("0000")){
            return -1;
        }
        int moves = 0;
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.offer("0000");
        visited.add("0000");

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size ; i++){
                String curr = q.poll();
                if(curr.equals(target)){
                    return moves;
                }
                
                for(int j = 0 ; j < 4 ; j++){
                    char[] arr = curr.toCharArray();
                    arr[j] = (char)(((arr[j] - '0') + 1) % 10 + '0');
                    String up = new String(arr);
                    if(!dead.contains(up) && visited.add(up)){
                        q.offer(up);
                    }

                    arr[j] = (char)((((curr.charAt(j)) - '0' ) + 9 ) % 10 + '0');
                    String down = new String(arr); 
                    if(!dead.contains(down) && visited.add(down)){
                        q.offer(down);
                    }
                   

                }
            }
             moves++;
            
        } 
        return -1;
    }
}