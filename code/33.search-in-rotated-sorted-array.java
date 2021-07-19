class Solution {
    public void nextPermutation(int[] nums) {
        int index1=-1;
        int index2=-1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1=i;
                break;
            }
        }
        if(index1!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[index1]){
                    index2=i;
                    break;
                }
            }
            if(index2!=-1){
                //swap index1 & index2
                int t = nums[index1];
                nums[index1]=nums[index2];
                nums[index2]=t;
            }
        }
        //reverse index1+1 to end;
        int j = n-1;
        for(int i=index1+1;i<j;i++,j--){
            int t = nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
    }
}