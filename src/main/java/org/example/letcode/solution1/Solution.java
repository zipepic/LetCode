package org.example.letcode.solution1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * @author xzz1p
 * @date 2023/11/07 11:54
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
