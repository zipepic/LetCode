package org.example.letcode.solution3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("au"));
    }
    public int lengthOfLongestSubstring(String s){
        for (int i=0;i<s.length();i++){
            int frameSize = s.length()-i;
            for(int j = 0;j<s.length()-frameSize+1;j++){
                String buff = s.substring(j,j+frameSize);
                if(frameCh(buff)){
                    return frameSize;
                }
            }
        }
        return s.length();
    }
    public boolean frameCh(String frame){
        for (int i =0; i< frame.length();i++){
            for (int j = 0;j<frame.length();j++){
                if(i!=j && frame.charAt(i) == frame.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
