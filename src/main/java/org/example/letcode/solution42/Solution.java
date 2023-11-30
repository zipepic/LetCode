package org.example.letcode.solution42;

import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().trap(new int[]{4,2,0,3,2,5}));
    }
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += Math.max(0, minHeight - height[i]);
        }

        return trappedWater;
    }
}
