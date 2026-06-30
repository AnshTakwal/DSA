class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(String s : tokens){
            
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") ){
                if(s.equals("+")){
                    int b = st.pop();
                    int a = st.pop();
                    int c = a + b;
                    st.push(c);
                }
                if(s.equals("-")){
                    int b = st.pop();
                    int a = st.pop();
                    int c = a - b;
                    st.push(c);
                }
                if(s.equals("*")){
                    int b = st.pop();
                    int a = st.pop();
                    int c = a * b;
                    st.push(c);
                }
                if(s.equals("/")){
                    int b = st.pop();
                    int a = st.pop();
                    int c = a / b;
                    st.push(c);
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}