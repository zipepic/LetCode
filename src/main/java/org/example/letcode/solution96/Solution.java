package org.example.letcode.solution96;

public class Solution {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
       return factorial(2*n)/(factorial(n+1)*factorial(n));
    }
    private int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
