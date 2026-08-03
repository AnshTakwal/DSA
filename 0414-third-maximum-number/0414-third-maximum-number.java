class Solution {
    public int thirdMax(int[] nums) {
        long l = Long.MIN_VALUE;
        long sl = Long.MIN_VALUE;
        long tl = Long.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == l || nums[i] == sl || nums[i] == tl) continue;
            else if(nums[i] > l){
                tl = sl;
                sl = l;
                l = nums[i];
            }
            else if(nums[i] < l && nums[i] > sl){
                tl = sl;
                sl = nums[i];
            }
            else if(nums[i] < sl && nums[i] > tl){
                tl = nums[i];
            }
        }
        if(tl != Long.MIN_VALUE){
            return (int)tl;
        }
        else{
            return (int)l;
        }
    }
}