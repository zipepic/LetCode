package org.example.letcode.solution935;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().knightDialer(30));
    }
    static final int[][] MOVES = {
            /*0*/ {4, 6},
            /*1*/ {6, 8},
            /*2*/ {7, 9},
            /*3*/ {4, 8},
            /*4*/ {0, 3, 9},
            /*5*/ {},
            /*6*/ {0, 1, 7},
            /*7*/ {2, 6},
            /*8*/ {1, 3},
            /*9*/ {2, 4}
    };
    private int n =0;
    public int knightDialer(int n) {
        this.n = n;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<10;i++){
            recurs(1,i,i,set);
        }
//        System.out.println(set);
        if( n == 1){
            return (int) set.stream().count() +1;
        }
        return (int) set.stream().count();
    }
    private void recurs(int count,int lastInteger,int s, Set<Integer> set){
        if(count >= this.n){
            for(int i: MOVES[lastInteger]){
                set.add(s);
            }
        }else {
            for(int i: MOVES[lastInteger]){
                recurs(count+1, i,s*10+i,set);
            }
        }
    }
}
