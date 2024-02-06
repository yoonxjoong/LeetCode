class Solution {
       public String sortVowels(String s) {
        // 문자열을 대소문자를 구분하여 문자 배열로 변환 lEOtcede
        char[] charArray = s.toCharArray();
        List<Character> tmp = new ArrayList<>();
        for(int i=0; i<charArray.length; i++){
            if(Character.toUpperCase(charArray[i]) == 'A'
                    || Character.toUpperCase(charArray[i]) == 'E'
                    || Character.toUpperCase(charArray[i]) == 'I'
                    || Character.toUpperCase(charArray[i]) == 'O'
                    || Character.toUpperCase(charArray[i]) =='U'){
                tmp.add(charArray[i]);
            }
        }
        Collections.sort(tmp);
        int a = 0;
        for(int i=0; i<charArray.length; i++){
            if(Character.toUpperCase(charArray[i]) == 'A'
                    || Character.toUpperCase(charArray[i]) == 'E'
                    || Character.toUpperCase(charArray[i]) == 'I'
                    || Character.toUpperCase(charArray[i]) == 'O'
                    || Character.toUpperCase(charArray[i]) =='U'){
                charArray[i] = tmp.get(a);
                a++;
            }
        }

        return String.valueOf(charArray);
    }
}