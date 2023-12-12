package org.example.letcode.solution917;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"));

    }
    public String reverseOnlyLetters(String s) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        for(int i =0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))) {
                map.put(i, s.charAt(i));
                }
            }
        String[] split = s.split("[^[a-zA-Z]]");
        String res = "";
        for(int i = split.length-1;i>=0;i--){
            StringBuilder stringBuilder = new StringBuilder(split[i]).reverse();
            res += stringBuilder.toString();
        }
        for(int i =0;i<s.length();i++){
            if(map.containsKey(i)){
                res = res.substring(0,i)+map.get(i)+res.substring(i);
            }
        }
        return res;
        }
//Qedo1ct-eeLg=ntse-T!
}
