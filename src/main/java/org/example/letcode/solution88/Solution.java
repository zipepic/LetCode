package org.example.letcode.solution88;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,0,0};
        Solution solution = new Solution();
        solution.merge(arr,3,new int[]{2,5,6},3);
        solution.print(arr);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int[] mergedArray = new int[m+n];
        while (i<m || j<n){
            if(nums1[i] < nums2[j] && i<m){
                mergedArray[i+j]=nums1[i];
                i++;
            }else if(j<n) {
                mergedArray[i+j] = nums2[j];
                j++;
            }
        }
       nums1 = mergedArray;
    }
    void print(int[] nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
