class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        if(n<=0 || intervals==null) return ans.toArray(new int[0][]);
        
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[]a:intervals){
            if(a[0]<=end){
                end = Math.max(end,a[1]);
            }else{
                ans.add(new int[]{start,end});
                start=a[0];
                end=a[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[1][]);
    }
}