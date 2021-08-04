class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        char[] arr = s.toCharArray();
        int ans = 0;
        int i = 0;
        int n = s.length();
        while(i < n){
            if(i < n-1 && hm.get(arr[i+1]) - hm.get(arr[i]) > hm.get(arr[i]) ){
                ans += hm.get(arr[i+1]) - hm.get(arr[i]);
                i+=2;
            }else{
                ans += hm.get(arr[i]);
                i++;
            }
        }
        return ans;
    }
}