class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sumArr = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            sumArr[i] = sum;
        }
        int max = sumArr[0];
        for(int k = 0; k < sumArr.length; k++){
            max = Math.max(max,sumArr[k]);
        }
        return max;
    }
}