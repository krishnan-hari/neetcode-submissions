class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        List newList = new ArrayList();
        for (int i=0; i<nums.length;i++){
            if(nums[i]!= val){
                newList.add( nums[i]);
            }
        }
        for (int i=0;i<newList.size();i++){
            nums[i]= (int)newList.get(i);
        }
        return newList.size();
    }
}