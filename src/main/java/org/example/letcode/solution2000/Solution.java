package org.example.letcode.solution2000;

public class Solution {
    public static void main(String[] args) {
        System.out.println( new Solution().reversePrefix("a", 'a'));

    }
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index>=0){
            StringBuilder stringBuilder = new StringBuilder(word.substring(0,index+1));
            return stringBuilder.reverse().append(word.substring(index+1)).toString();
        }
        return word;
    }
}
