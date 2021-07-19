class Solution {
    public double myPow(double x, int n) {
        long t = n;
        double ans=1.0;
        if(t<0) t = -t; //negative to positive
        while(t>0){
            if(t%2==1){
                //operation for odd power
                ans = ans * x;
                t=t-1;
            }else{
                x = x * x;
                t=t/2;
            }
        }
        if(n<0) return (double)1/(double) ans;
        return ans;
        
    }
}