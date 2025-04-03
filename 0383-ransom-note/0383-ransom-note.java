class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0 ;i < magazine.length(); i++) {
            char tmp = magazine.charAt(i);

            if(hm.containsKey(tmp)) {
                int val = hm.get(tmp) + 1;

                hm.put(tmp, val);
                continue;
            }

            hm.put(tmp, 1);
        }


        for(int i = 0; i < ransomNote.length(); i++) {
            System.out.println(ransomNote.charAt(i));
            char tmp = ransomNote.charAt(i);

            if(!hm.containsKey(tmp)) {
                return false;
            }

            int val = hm.get(tmp) - 1;
            if(val == 0) {
                hm.remove(tmp);
                continue;
            }
            hm.put(tmp, val);
            System.out.println(val);
        }


        return true;
    }
}