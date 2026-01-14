class Solution {
     public boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap<>();

        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for(int i= 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }

            char tmp = stack.peek();
            char current = s.charAt(i);

            boolean exist = hm.containsKey(tmp);

            if(exist) {
                char a = hm.get(tmp);
                
                if(a == current) {
                    stack.pop();
                }else{
                    stack.push(current);
                }
            }

        }

        return stack.size() < 1;
    }
}