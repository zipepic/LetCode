package org.example.letcode.solution20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "( [ { } ] )";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> charPairs = new HashMap<>();
        charPairs.put('(', ')');
        charPairs.put('{', '}');
        charPairs.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char achar = s.charAt(i);
            try {
                if (charPairs.containsKey(achar)) {
                    stack.push(achar);
                } else if (charPairs.containsValue(achar) && charPairs.get(stack.peek()).equals(achar)) {
                    stack.pop();
                } else {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return stack.empty();
    }
}
