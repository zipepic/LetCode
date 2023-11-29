package org.example.letcode.solution35;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3},2));
    }
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left<right){
                int mid = left+ (right-left)/2;
                int number = nums[mid];
                if(number<target){
                    left = mid+1;
                }else if(number>target){
                    right = mid-1;
                }else {
                    return mid;
                }
        }
        return left;
    }
}
