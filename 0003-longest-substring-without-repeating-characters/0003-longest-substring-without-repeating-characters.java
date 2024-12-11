class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        * 1. 왼쪽/오른쪽 포인터, 최대 길이 값을 담을 int 변수를 초기화 한다. 고유문자를 담을 Set 변수을 초기화한다.
        * 2. 오른쪽 포인터가 문자열 끝에 닿을 때까지 반복할 때,
            1) 오른쪽 포인터의 문자가 고유문자Set에 없으면, 추가하고 포인터를 하나 늘린다.
               이 때, 현재까지의 최대 길이와 고유문자 길이 Set의 길이 중 더 긴 것을 최대 길이로 갱신한다.
            2) 만약 오른쪽 포인터의 문자가 고유문자Set에 있었다면 왼쪽 포인터의 문자를 Set에서 제거한다.
            (오른쪽 포인터는 바뀌지 않기 때문에 중복이 발생한 오른쪽 포인터의 글자를 지울 때까지 왼쪽 포인터가 이동함)
        */
        
        // 1. 왼쪽/오른쪽 포인터 변수를 초기화 합니다.
        int left = 0;
        int right = 0;
        
        // 2. 최대 길이 값을 담을 int 변수를 초기화합니다.
        int maxLength = 0;

        // 3. 고유 문자를 담을 Set을 설정
        Set<Character> charSet = new HashSet<>();

        while(right < s.length()) {
            // 오른쪽 포인터 문자가 set에 없으면 추가하고 포인터를 하나 늘린다.
            if(!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right++));
                maxLength = Math.max(maxLength, charSet.size());
            }
            // 만약 오른쪽 포인터의 문자가 고유문자Set에 있었다면 왼쪽 포인터의 문자를 Set에서 제거한다.
            else {
                charSet.remove(s.charAt(left++));
            }
        }


        return maxLength;
    }
}