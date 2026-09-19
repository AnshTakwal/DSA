class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerosCount = 0;
        int left = 0;
        int maxl = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0) zerosCount++;
            while(zerosCount > k){
                if(nums[left] == 0){
                    zerosCount--;
                    
                }
                left++;
            }
            maxl = Math.max(maxl,right-left+1);
        }
        return maxl;
    }
}