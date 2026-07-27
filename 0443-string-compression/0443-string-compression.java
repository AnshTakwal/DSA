class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int idx = 0;
        while(i < chars.length){
            char curr = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == curr){
                i++;
                count++;
            }
            chars[idx++] = curr;
            if(count > 1){
                String str = String.valueOf(count);
                for(char c : str.toCharArray()){
                    chars[idx++] = c;
                } 
            }
           
        }
        return idx;
    }
}