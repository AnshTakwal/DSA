class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    length++;
                    current = current + 1;
                    
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}