package org.example.letcode.solution4;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        for (int i =0; i<nums1.length; i++) {
            result[i] = nums1[i];
        }
        for (int i=0; i< nums2.length;i++){
            result[i+nums1.length]=nums2[i];
        }
        nums1 = Arrays.stream(result).sorted().toArray();
        if(nums1.length%2==0) {
            return (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2.0;
        }else {
            return nums1[nums1.length/2];
        }
    }
}
