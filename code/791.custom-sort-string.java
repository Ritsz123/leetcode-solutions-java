class Solution {
    public String customSortString(String order, String str) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        
        for(int i = 0;i<order.length();i++){
            a1[order.charAt(i) - 'a']++;
        }
        
        for(int i = 0;i<str.length();i++){
            a2[str.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<order.length();i++){
            if(a2[order.charAt(i) - 'a'] > 0){
                while(a2[order.charAt(i) - 'a']-- > 0){
                    sb.append(order.charAt(i));
                }
            } 
        }
        
        for(int i = 0;i<str.length();i++){
            while(a2[str.charAt(i) - 'a']-- > 0){
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
}