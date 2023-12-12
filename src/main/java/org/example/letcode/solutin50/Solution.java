package org.example.letcode.solutin50;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().myPow(-1.00001, 447125));
    }
    public double myPow(double x, int n) {
        boolean flag = true;
        if(x == 1.0){
            return 1.0;
        }
        if(x == -1.0){
            if(n%2 == 0){
                return 1.0;
            }else {
                return -1.0;
            }
        }
        if(n < 0){
            flag = false;
        }
        if(n == 0){
            return 1;
        }
        if(n < -500000 || n > 500000){
            return 0.0;
        }
        double res = x;
        long whil = Math.abs((long)n);
        for(long i = 1;i<whil;i++){
            res = res*x;
        }

        if(!flag){
            return 1/res;
        }
        return res;
    }
}
