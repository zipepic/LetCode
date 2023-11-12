package org.example.letcode.solution60;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getPermutation(9,3));
    }
    public String getPermutation(int n, int k) {
        String s = getAllCharacter(n);
        List<String> permutation = new ArrayList<>();
        Set<String> set = new HashSet<>();
        permutation(permutation, "", s, set);
        Collections.sort(permutation);

        return permutation.get(k - 1);
    }

    private String getAllCharacter(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(i);
        }
        return result.toString();
    }

    private void permutation(List<String> list, String res, String s, Set<String> set) {
        if (s.isEmpty()) {
            if (set.add(res)) {
                list.add(res);
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                permutation(list, res + s.charAt(i), s.substring(0, i) + s.substring(i + 1), set);
            }
        }
    }

}
