class Solution {
    public void moveZeroes(int[] nums) {
        int idx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[++idx] = nums[i];
            }
        }
        while(idx < nums.length-1){
            nums[++idx] = 0;
        }
    }
}