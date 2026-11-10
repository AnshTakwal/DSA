class Solution {
    public String longestCommonPrefix(String[] strs) {
        //StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs[0].length();i++){
            for(int l = 1 ; l <strs.length ; l++){
                if(i == strs[l].length() || strs[0].charAt(i) != strs[l].charAt(i)) return strs[0].substring(0,i);
                
            }
           // sb.append(strs[0].charAt(i));
        }
        return strs[0];
    }
}