class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(ch == '#' && st1.isEmpty()) continue;
            else{
                st1.push(ch);
            }
        }
        for(char ch : t.toCharArray()){
            if(ch == '#' && !st2.isEmpty()){
                st2.pop();
            }
            else if(ch == '#' && st2.isEmpty()) continue;
            else{
                st2.push(ch);
            }
        }
        while(!st1.isEmpty()){
            sb1.append(st1.pop());
        }
        while(!st2.isEmpty()){
            sb2.append(st2.pop());
        }
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}