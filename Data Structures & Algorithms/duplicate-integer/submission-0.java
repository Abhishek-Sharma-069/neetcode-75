class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int val : nums) {
            if (mp.containsKey(val)) {
                return true;
            }
            mp.put(val,1);
        }

        return false;
    }
}