class Solution {
    public boolean stoneGame(int[] piles) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0;i<piles.length;i++){
            if(i %2 == 0) evenSum += piles[i];
            else oddSum += piles[i];
        }
        
        if(evenSum > oddSum || oddSum > evenSum){
            return true;
        }
        return false;
    }
}