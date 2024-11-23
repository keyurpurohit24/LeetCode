class Solution {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length]; 
        for(int i = 0;i < nums.length; i++){
            if(i == 0){
                newArr[0] = nums[i];
            }
            else{
                newArr[i] = nums[i] + newArr[i-1];
            }
        }
        return newArr;
    }
}