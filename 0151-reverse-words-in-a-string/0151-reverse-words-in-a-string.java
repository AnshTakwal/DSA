class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i = arr.length-1; i >= 0 ; i--){
            if(i > 0){
                sb.append(arr[i]);
                sb.append(" ");
            }
            else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}