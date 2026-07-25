class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int value = Math.abs(nums[i]);
            int key = value - 1;
            if(nums[key] > 0){
                nums[key] = nums[key] * -1 ;
            }
            else{
                ans.add(value);
            }
        }
        return ans;
    }
}