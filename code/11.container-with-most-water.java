class Solution {
    public boolean isPalindrome(int x) {
        String org = "" + x;
        char[] arr = org.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            char t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        String rev = new String(arr);
        return org.equals(rev);
    }
}