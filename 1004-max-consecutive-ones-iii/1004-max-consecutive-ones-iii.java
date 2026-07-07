class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroscount = 0;
        int maxl = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right]==0){
                zeroscount++;
            }
            while(zeroscount>k){
                if(nums[left]==0){
                    zeroscount--;

                }
                left++;
            }
            maxl = Math.max(maxl,right-left+1);
        }
        return maxl;
    }
}