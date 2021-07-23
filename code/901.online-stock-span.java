class StockSpanner {

    Stack<Integer> st;
    ArrayList<Integer> al;
    int i = -1;
    public StockSpanner() {
        st = new Stack<>();
        al = new ArrayList<>();
    }
    
    public int next(int price) {
        i++;
        al.add(price);
        int ans = 0;
        while(!st.isEmpty() && al.get(st.peek()) <= price){
            st.pop();
        }
        
        if(st.isEmpty()) ans = i + 1;
        else ans = i - st.peek();
        
        st.push(i);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */