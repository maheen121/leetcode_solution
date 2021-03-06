class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement = 0;
        int result[] = new int [2];
        for (int i = 0;i<nums.length;i++){
            result[0] = i;
            complement = target - nums[i];
            for (int j = i+1;j<nums.length;j++){
                if (nums[j] == complement){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
