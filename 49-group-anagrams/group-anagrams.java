import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = sortingString(str);

            // create list if absent, then add string
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String sortingString(String str) {

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}