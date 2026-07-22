class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currSum = 0;
        int ans = 0;
        for(int num : nums){
            currSum += num;
            ans += map.getOrDefault(currSum-goal,0);
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return ans;
    }
}