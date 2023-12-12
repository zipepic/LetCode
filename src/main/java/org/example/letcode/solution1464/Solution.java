package org.example.letcode.solution1464;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println( new Solution().maxProduct(new int[]{10,2,5,2}));
    }
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1] -1)*(nums[nums.length-2]-1);
    }
}
