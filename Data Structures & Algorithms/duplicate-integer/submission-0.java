class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean state = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i] ){
                state= true;
                break;
            }
        }
     return state;   
    }
}