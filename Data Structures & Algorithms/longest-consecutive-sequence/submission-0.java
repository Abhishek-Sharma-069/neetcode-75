class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> sortedSet = new TreeSet<>();

        for (int num : nums) {
            sortedSet.add(num);
        }

        int val = 1;
        int maxi = 1;
        Integer prev = null;

        for (int num : sortedSet) {

            if (prev != null && num == prev + 1) {
                val++;
            } else {
                val = 1;
            }

            maxi = Math.max(maxi, val);
            prev = num;
        }

        return maxi;
    }
}