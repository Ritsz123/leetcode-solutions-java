class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        if(arr.length<1) return 0;
        HashSet<Character> hs = new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(hs.add(arr[j])){
                    count++;
                }else{
                    break;
                }
            }
            max = Math.max(max,count);
            hs.clear();
        }
        return max;
    }
}