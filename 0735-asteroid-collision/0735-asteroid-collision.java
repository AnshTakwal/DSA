class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int asteroide : asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek()>0 && asteroide<0){
                if(st.peek() < -asteroide){
                    st.pop();
                   // collision = true;
                }
                else if(st.peek() == -asteroide){
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(asteroide);
            }
        }
        int[] arr = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--){
            arr[i] = st.pop();
        }
        return arr;

    }
}