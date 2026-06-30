class Solution {

    int index = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {

            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {

                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++;

                String str = decodeString(s);

                index++;

                for (int i = 0; i < num; i++) {
                    result.append(str);
                }

            } else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }
}