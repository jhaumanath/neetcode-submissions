class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> pairMap = new HashMap<>();
        int[] pair = new int[2];
        for(int i = 0;i < nums.length ; i++){
            if(pairMap.containsKey(target-nums[i])){
                pair[0] = pairMap.get(target-nums[i]);
                pair[1] = i;
                return pair;
            }
            else{
                pairMap.put(nums[i],i);
            }
        }
        return pair;
    }
}
