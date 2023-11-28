package org.example.letcode.solution7;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(1534236469));

    }
    public int reverse(int x) {
        boolean flag = x < 0;
        String reversedString = new StringBuilder(Integer.toString(x)).reverse().toString().replaceAll("-", "");
        try {
            int reversedLong = Integer.valueOf(reversedString);
            if (flag) {
                reversedLong *= -1;
            }
            return reversedLong;
        }catch (Exception e){
            return 0;
        }
    }
}
