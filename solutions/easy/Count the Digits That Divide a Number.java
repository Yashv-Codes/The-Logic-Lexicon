// Title: Count the Digits That Divide a Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/

        while(val!= 0){
            int lastdigit = val % 10;
            if(num % lastdigit == 0){
        }
                count++;
            }
            
            val /= 10;
        int count = 0;
        int val = num;
class Solution {
    public int countDigits(int num) {
