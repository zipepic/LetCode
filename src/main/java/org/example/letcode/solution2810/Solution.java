package org.example.letcode.solution2810;

public class Solution {
    public String finalString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                String substring1 = s.substring(i);
                String substring2 = s.substring(0, i);

                s = new StringBuilder(substring2)
                        .reverse().append(substring1).toString();
            }
        }
        return s.replaceAll("i", "");
    }
}
