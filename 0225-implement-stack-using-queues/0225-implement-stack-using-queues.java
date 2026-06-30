class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            int y = q1.poll();
            q2.offer(y);
        }
        q1.offer(x);
        while(!q2.isEmpty()){
            int z = q2.poll();
            q1.offer(z);
        }
    }
    
    public int pop() {
        if(q1.isEmpty()) return 0;
        else return q1.poll();
    }
    
    public int top() {
        int a = q1.peek();
        return a;        
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */