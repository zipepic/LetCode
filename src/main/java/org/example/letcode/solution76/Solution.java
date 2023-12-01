package org.example.letcode.solution76;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ADOBECODEBANC","ABC"));
    }
    public String minWindow(String s, String t) {
        List<String> sizez = new ArrayList<>();
        ref(sizez,s,t,t.length(),0,s.length());
        for (String ss:sizez){
            System.out.println(ss);
        }
        return sizez.stream().filter(ss -> ss.length()>=t.length()).sorted( (comp, copm2) -> {
            if(comp.length() > copm2.length()){
                return 1;
            }else if(comp.length() < copm2.length()) {
                return -1;
            }else{
                return 0;
            }
        }).findFirst().orElse("").toString();
    }
    private void ref(List<String> list,String s,String t, int sizeOft, int start, int finish){
        if(sizeOft==0){
            list.add(s.substring(start,finish));
            return;
        }
        for(int i =0;i< s.length();i++){
            int index = t.indexOf(s.charAt(i));
            if(index != -1){
                if(start==0){
                    start = i;
                }
                ref(list,s,t.replace(t.charAt(index),Character.MIN_VALUE),sizeOft-1,start,finish);
            }
        }
    }
}
