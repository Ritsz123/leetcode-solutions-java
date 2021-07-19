class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<strs.length;i++){
            if(strs[i].length() < min){
                min = strs[i].length();
            }
        }
        
        for(int x = 0; x< min;x++){
            char ch = strs[0].charAt(x);
            boolean pos = true;
            for(int i = 0; i<strs.length;i++){
                if(strs[i].charAt(x) != ch){
                    pos = false;
                    break;
                }
            }
            if(pos)
            ans.append(ch);
            else break;
        }
        return ans.toString();
    }
}