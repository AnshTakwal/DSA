class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<n;i++){
            int currMin = arr[i] - arr[i-1];
            min = Math.min(min,currMin);
        }
        for(int i = 1;i<n;i++){
            if(arr[i] - arr[i-1] == min){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;

    }
}