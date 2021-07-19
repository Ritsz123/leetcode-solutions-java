class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            switch (ch) {
                case '{' :
                case '[' :
                case '(' : st.push(ch); break;
                case '}' : 
                    if(st.isEmpty() || st.peek() != '{'){ 
                        return false;
                    }else{
                        st.pop();
                    }
                    break;
                case ']' : 
                    if(st.isEmpty() || st.peek() != '['){
                        return false;
                    }else{
                        st.pop();
                    }
                    break;
                case ')' :
                    if(st.isEmpty() || st.peek() != '('){
                        return false;
                    }else{
                        st.pop();
                    }
                    break;
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}