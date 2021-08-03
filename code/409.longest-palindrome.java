class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[52];
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) <= 'Z'){
                 count[s.charAt(i) - 'A']++;
            }else{
                count[s.charAt(i) - 'a' + 26]++;
            }
           
        }
        
        int len = 0;
        boolean ones = false;
        for(int i = 0; i<52;i++){
            if(!ones && count[i] % 2 == 1) {
                ones = true;
            }
            len += count[i]/2;
        }
        
        return ones? len * 2 + 1 : len * 2;
    }
}