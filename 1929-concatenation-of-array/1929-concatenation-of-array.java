class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            newArr[nums.length + j] = nums[j];
        }
        return newArr;
    }
}