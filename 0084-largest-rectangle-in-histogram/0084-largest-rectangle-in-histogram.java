class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int max = 0;
        for(int i = 0; i <= n; i++){
            while(!st.isEmpty() && ( i==n || heights[i] <= heights[st.peek()])){
                int element = st.pop();
                int width;
                if(st.isEmpty()){
                    width = i;
                }
                else{
                    width = i - st.peek() -1;
                }
                //int width = i-element-1;
                int height = heights[element];
                max = Math.max(max,height*width); 
            }
            st.push(i);
        }
        
        return max;
    }
}