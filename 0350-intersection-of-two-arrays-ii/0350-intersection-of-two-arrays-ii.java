class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = 0;
        while( l < nums1.length && r < nums2.length){
            if(nums1[l] == nums2[r]){
                ans.add(nums1[l]);
                l++;
                r++;
            }
            else if(nums1[l] < nums2[r]){
                l++;
            }
            else{
                r++;
            }
        }
        int[] arr = new int[ans.size()];
        int idx = 0;
        for(int num : ans){
            arr[idx++] = num;
        }
        return arr;
    }
}