package org.example.letcode.solution9;

public class Solution {
//    public boolean isPalindrome(int x) {
//        char[] array = Integer.toString(x).toCharArray();
//        short left =0;
//        int right = array.length-1;
//        while (left<=right){
//            if (array[left]!=array[right]){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
public boolean isPalindrome(int x) {
    String  array = Integer.toString(x);
    short left =0;
    int right = array.length()-1;
    while (left<=right){
        if (array.charAt( left)!=array.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}
