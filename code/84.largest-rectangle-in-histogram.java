class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] prev = new int[n];
        int[] next = new int[n];
        
        Stack<Integer> st = new Stack<>();
        prev[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            prev[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        st.clear();
        next[n-1] = n;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            next[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        int[] width = new int[n];
        for(int i = 0;i<n;i++){
            width[i] = (next[i] - prev[i] - 1);
            // System.out.print(width[i] + " ");
        }
        
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int c = width[i] * arr[i];
            max = Math.max(max,c);
        }
        return max;
    }
}