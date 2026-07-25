
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> sortedMp =
                mp.entrySet()
                  .stream()
                  .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                  .collect(Collectors.toMap(
                          Map.Entry::getKey,
                          Map.Entry::getValue,
                          (a, b) -> a,
                          LinkedHashMap::new
                  ));

        int[] ans = new int[k];
        int index = 0;

        for (Integer key : sortedMp.keySet()) {
            ans[index++] = key;
            if (index == k)
                break;
        }

        return ans;
    }
}