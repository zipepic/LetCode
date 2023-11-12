package org.example.letcode.solution14;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"",""};
        System.out.println(solution.longestCommonPrefix(strs));
    }
    //Speed Beats 23.54%of users with Java
    //Memory Beats 71.37%of users with Java
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i=0;i<strs[0].length();i++){
            int k =0;
            String sub = strs[0].substring(0,i+1);
            for(int j = 1;j<strs.length;j++){
                if(strs[j].startsWith(sub)){
                    k++;
                }
            }
            if(k==strs.length-1){
                res = sub;
            }
        }
        return res;
    }

    public String findPref(String[] strs) {
        String finalPref = "";
        try {
            for(int i = 0; i < strs.length; i++) {
                String subString = strs[i].substring(i, i+1);
                if(subString.equals(strs[i+1].substring(i, i+1))) {
                    finalPref = finalPref + subString;
                }
            }
        } catch (Exception e) {
            return "";
        }
        return finalPref;
    }

}
