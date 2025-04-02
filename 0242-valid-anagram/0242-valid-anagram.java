class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i=0; i< s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                continue;
            }

            hm.put(s.charAt(i), 1);
        }

        HashMap<Character, Integer> hm2 = new HashMap<>();


        for (int i=0; i< t.length(); i++) {
            if(hm2.containsKey(t.charAt(i))) {
                hm2.put(t.charAt(i), hm2.get(t.charAt(i)) + 1);
                continue;
            }

            hm2.put(t.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            char k = entry.getKey();
            int v = entry.getValue();

            int v2 = hm2.getOrDefault(k, 0);

            if(v != v2) {
                return false;
            }
        }

        for (Map.Entry<Character, Integer> entry : hm2.entrySet()){
            char k = entry.getKey();
            int v = entry.getValue();

            int v2 = hm.getOrDefault(k, 0);

            if(v != v2) {
                return false;
            }
        }

        return true;
    }
}