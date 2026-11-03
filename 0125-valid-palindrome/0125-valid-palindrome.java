class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length ; i++){
            if(Character.isLetterOrDigit(arr[i])){
                sb.append(Character.toLowerCase(arr[i]));
            }
        }
        int l = 0;
        int r = sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)) return false;
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}