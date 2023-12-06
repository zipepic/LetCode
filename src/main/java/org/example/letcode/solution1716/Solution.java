package org.example.letcode.solution1716;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().totalMoney(20));
    }
    public int totalMoney(int n) {
        int numOfWeek = n/7;
        int totalMoney = 0;

        for(int i=1;i<=numOfWeek;i++){
            totalMoney+=getMoney(i);
        }

        int left = n%7;
        numOfWeek++;
        for(int i=0;i<left;i++){
            totalMoney+=numOfWeek;
            numOfWeek++;
        }
        return totalMoney;
    }
    private int getMoney(int numOfWeek){
        int money = 0;
        for(int i=0;i<7;i++){
            money+=numOfWeek;
            numOfWeek++;
        }
        return money;
    }
}
