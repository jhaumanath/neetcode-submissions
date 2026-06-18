class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> dup = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(dup.containsKey(nums[i])){
                return true;
            }
            else{
                dup.put(nums[i],true);
            }
        }
        return false;
    }
}