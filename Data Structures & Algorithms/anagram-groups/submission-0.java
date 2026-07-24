
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> stringTable = new HashMap<>();

        for (String str : strs) {

            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if (stringTable.containsKey(sorted)) {

                List<String> ls = stringTable.get(sorted);
                ls.add(str);

            } else {

                List<String> ls = new ArrayList<>();
                ls.add(str);
                stringTable.put(sorted, ls);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> list : stringTable.values()) {
            ans.add(list);
        }

        return ans;
    }
}