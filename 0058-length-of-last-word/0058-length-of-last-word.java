class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
        
            if(Character.isLetterOrDigit(s.charAt(i))){
                count++;
            }
            else if(s.charAt(i) == ' '){
                break;
            }
        }
        return count;
    }
}