class Solution {
    public int minSteps(String s, String t) {
          // 체크할 두 문자열의 길이가 같은지 확인
        if (s.length() != t.length()) {
            throw new IllegalArgumentException("Input strings must have the same length");
        }

        // 각 문자의 빈도수를 저장하는 맵
        Map<Character, Integer> charFrequency = new HashMap<>();

        // 문자열 s의 각 문자의 빈도수를 계산
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int steps = 0;

        // 문자열 t의 각 문자의 빈도수를 확인하면서 아나그램을 만들기 위해 필요한 단계 수를 계산
        for (char c : t.toCharArray()) {
            if (charFrequency.containsKey(c) && charFrequency.get(c) > 0) {
                // 현재 문자가 맵에 존재하고 빈도수가 0보다 크면 매칭되는 문자가 있으므로 빈도수를 감소
                charFrequency.put(c, charFrequency.get(c) - 1);
            } else {
                // 현재 문자가 맵에 존재하지 않거나 빈도수가 0인 경우 아나그램을 만들기 위해 단계가 필요하므로 증가
                steps++;
            }
        }

        return steps;
    }
}