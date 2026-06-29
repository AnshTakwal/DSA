class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
           int curr = nums1[i];
            Stack<Integer> st = new Stack<>();
            for(int j=nums2.length-1;j>=0;j--){
                while(!st.isEmpty() && st.peek()<=curr){
                    st.pop();
                }
                if(nums2[j]==curr){
                    if(st.isEmpty()){
                        ans[i] = -1;
                    }
                    else{
                        ans[i] = st.peek();
                    }
                    break;
                   
                }
                st.push(nums2[j]);
            }
        }
        return ans;

    }
}