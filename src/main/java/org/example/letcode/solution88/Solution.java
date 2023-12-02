package org.example.letcode.solution88;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,0,0,0};
        Solution solution = new Solution();
        solution.merge(arr,3,new int[]{1,2,3},3);
        solution.print(arr);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for(int i =0;i<nums1.length;i++){
           if(j<n&&nums1[i]==0){
               nums1[i] = nums2[j];
               j++;
           }
        }
        Arrays.sort(nums1);
    }
    void print(int[] nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
