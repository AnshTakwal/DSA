class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(!(Character.isLetterOrDigit(s.charAt(l))) && l < s.length() && l < r) l++;
            while(!(Character.isLetterOrDigit(s.charAt(r))) && r > 0 && l < r) r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;

        }
        return true;
    }
}