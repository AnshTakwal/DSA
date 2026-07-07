class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> currstring = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                 num = num*10 + (c - '0');
            }
            else if(c=='['){
                count.push(num);
                currstring.push(curr);

                num = 0;
                curr = new StringBuilder();
            }
            
            else if(c==']'){
                StringBuilder prev = currstring.pop();
                int times = count.pop();
                for(int i = 0;i<times;i++){
                    prev.append(curr);
                }
                curr = prev;
                //currstring.push(curr); 
            }
            else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}