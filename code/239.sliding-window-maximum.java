import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return nums;
        Deque<Integer> dq = new LinkedList<>();
        int [] ans = new int[n-k+1];
        for(int i=0;i<nums.length;i++){
            if(i<k){
                while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                    dq.removeLast();
                }   
                dq.addLast(i);
            }
            else{
                ans[i-k] = nums[dq.peekFirst()];
                if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                    dq.removeLast();
                }   
                dq.addLast(i);
            }
        }
        ans[ans.length-1]=nums[dq.peekFirst()];
        return ans;
    }
}
