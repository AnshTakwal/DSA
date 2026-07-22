class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      //  int sum = 0;
        int count = 0;
        for(int l = 0;l<nums.length;l++){
            int sum = 0;
            for(int r = l;r<nums.length;r++){
                sum += nums[r];
                if(sum == goal){
                    count++;
                }
            }
        }
        return count;
    }
}