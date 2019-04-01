class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> left = new HashMap<Integer, Integer> ();
        for(int i=0; i<nums.length; i++) {
            if(left.get(new Integer(nums[i])) != null) {
                int[] result = {left.get(new Integer(nums[i])), i};
                return result;
            }
            else{
                left.put(new Integer(target-nums[i]), new Integer(i));
            }
        }
        int[] empty = new int[0];
        return empty;
    }
}