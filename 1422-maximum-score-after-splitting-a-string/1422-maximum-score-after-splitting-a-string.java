class Solution {
    public int maxScore(String s) {
         int n = s.length();

        // 0과 1의 개수를 누적하여 저장하는 배열 생성
        int[] zerosCount = new int[n + 1];
        int[] onesCount = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            zerosCount[i] = zerosCount[i - 1] + (s.charAt(i - 1) == '0' ? 1 : 0);
            onesCount[i] = onesCount[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
        }

        int maxScore = 0;

        // 문자열을 나누어 각 지점에서의 점수 계산
        for (int i = 1; i < n; i++) {
            int leftZeros = zerosCount[i];
            int rightOnes = onesCount[n] - onesCount[i];
            int score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}