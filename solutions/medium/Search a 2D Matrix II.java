// Title: Search a 2D Matrix II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(target < matrix[r][c]){
                c--;
            }
            else{
                r++;
        int r = 0, c = matrix[0].length-1;
    public boolean searchMatrix(int[][] matrix, int target) {
class Solution {
