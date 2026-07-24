class Solution {
    private int atmost(int[] nums,int k){
        int l = 0;
        int ans = 0;
        for(int r = 0; r < nums.length;r++){
            if(nums[r]%2 == 1){
                k--;
            }
            while(k<0){
                if(nums[l]%2 == 1){
                    k++;
                }
                l++;
            }
            ans += r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums , k) - atmost(nums,k-1);
    }
}