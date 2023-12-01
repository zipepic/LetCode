package org.example.letcode.solutin202;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(2));
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        return recurce(n,set);
    }
    private boolean recurce(int n, Set<Integer> set){
        if(n==1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        int sum = 0;
        while (n>0){
            int i = n % 10;
            sum+=i*i;
            n = n/10;
        }
        return recurce(sum,set);
    }
}
