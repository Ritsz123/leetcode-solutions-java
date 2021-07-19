class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        
        for(String x: strs){
            if(!x.isEmpty())
                st.push(x);
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}