class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');

        for(int i = 0; i < s.length(); i++) {
            // 스택에 아무것도 없을 경우
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }

            char tmp = stack.peek();

            if(!hm.containsKey(tmp)) {
                continue;
            }

            if (s.charAt(i) == hm.get(tmp)) {
                stack.pop();
                continue;
            }

            stack.push(s.charAt(i));
        }

        return stack.isEmpty();
    }
}