package org.example.letcode.solution1688;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().numberOfMatches(7));
    }
    public int numberOfMatches(int n) {
        if (n==1){
            return 0;
        }
        int i = n/2;
        return numberOfMatches(n-i) + i;
    }
}
