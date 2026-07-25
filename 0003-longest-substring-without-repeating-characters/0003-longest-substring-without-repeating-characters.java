class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 0;
        int l = 0; 
        HashSet<Character> set = new HashSet();
        for(int r = 0 ;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            int currl = r-l+1;
            maxl = Math.max(maxl,currl);
        }
        return maxl;
    }
}