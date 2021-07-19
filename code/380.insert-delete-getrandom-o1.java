class Solution {
    public void reverseString(char[] arr) {
        int i=0;
        int j = arr.length-1;
        while(i<j){
            char ch = arr[i];
            arr[i]=arr[j];
            arr[j]=ch;
            i++;
            j--;
        }
    }
}