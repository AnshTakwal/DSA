class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int rev = 0;
        while(x>0){
            int ld = x%10;
            rev = rev*10 + ld;
            x = x/10;
        }
        if(og == rev){
            return true;
        }
        else{
            return false;
        }
    }
}