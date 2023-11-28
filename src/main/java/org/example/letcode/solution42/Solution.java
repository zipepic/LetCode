package org.example.letcode.solution42;

class Solution {
    public static void main(String[] args) {
        new Solution().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
    public int trap(int[] height) {
        int max=0;
        for (int i:height){
            if(i>max)
                max=i;
        }
        int[][] array = new int[height.length][max];
        for(int i =0;i<height.length;i++){
            for(int j = 0; j < max;j++){
                if(j<height[i]){
                    array[i][j] = 1;
                }else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = max-1;i>=0;i--){
            for (int j = 0;j<height.length;j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        return -1;
    }
}
