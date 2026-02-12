class Solution {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> kvp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!kvp.containsKey(complement))
                kvp.put(nums[i], i);
            else
                return new int[]{(int)kvp.get(complement), i};
            
        }
         return new int[]{0, 0};
    }
    /*public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target-nums[i] == nums[j])
                    return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }*/
}
