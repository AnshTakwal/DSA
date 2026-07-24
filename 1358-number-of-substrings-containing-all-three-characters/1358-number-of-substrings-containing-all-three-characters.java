class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int freqA = 0;
        int freqB = 0;
        int freqC = 0;
        int l = 0;
        int count = 0;
        for(int r = 0;r<n;r++){
            if(s.charAt(r) == 'a') freqA++;
            if(s.charAt(r) == 'b') freqB++;
            if(s.charAt(r) == 'c') freqC++;
            if(freqA > 0 && freqB > 0 && freqC >0){
                //count += n - r;
                while(l<=r && freqA > 0 && freqB > 0 && freqC > 0){
                    count += n-r;
                    if(s.charAt(l) == 'a') freqA--;
                    if(s.charAt(l) == 'b') freqB--;
                    if(s.charAt(l) == 'c') freqC--;
                    l++;

                }
            }
        }
        return count;
    }
}